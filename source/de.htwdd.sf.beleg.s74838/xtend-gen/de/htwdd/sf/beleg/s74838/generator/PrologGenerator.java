package de.htwdd.sf.beleg.s74838.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import de.htwdd.sf.beleg.s74838.prolog.Atom;
import de.htwdd.sf.beleg.s74838.prolog.Clause;
import de.htwdd.sf.beleg.s74838.prolog.Exquery;
import de.htwdd.sf.beleg.s74838.prolog.Fact;
import de.htwdd.sf.beleg.s74838.prolog.Folge;
import de.htwdd.sf.beleg.s74838.prolog.NotEmptyList;
import de.htwdd.sf.beleg.s74838.prolog.Predicate;
import de.htwdd.sf.beleg.s74838.prolog.Program;
import de.htwdd.sf.beleg.s74838.prolog.PrologDsl;
import de.htwdd.sf.beleg.s74838.prolog.Query;
import de.htwdd.sf.beleg.s74838.prolog.Rule;
import de.htwdd.sf.beleg.s74838.prolog.Term;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class PrologGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<PrologDsl> _filter = Iterables.<PrologDsl>filter(_iterable, PrologDsl.class);
    for (final PrologDsl e : _filter) {
      {
        System.out.println("Start der Transformation \n");
        CharSequence _gen = this.gen(e);
        fsa.generateFile("prologDsl.lsp", _gen);
      }
    }
  }
  
  public CharSequence gen(final PrologDsl item) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(prolog (quote (");
    _builder.newLine();
    _builder.append("\t");
    Program _program = item.getProgram();
    EList<Clause> _clause = _program.getClause();
    final Function1<Clause, CharSequence> _function = new Function1<Clause, CharSequence>() {
      public CharSequence apply(final Clause it) {
        return PrologGenerator.this.gen(it);
      }
    };
    List<CharSequence> _map = ListExtensions.<Clause, CharSequence>map(_clause, _function);
    String _join = IterableExtensions.join(_map, "\n");
    _builder.append(_join, "\t");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("))");
    _builder.newLine();
    _builder.append("(quote (");
    Exquery _exquery = item.getExquery();
    Query _query = _exquery.getQuery();
    CharSequence _gen = this.gen(_query);
    _builder.append(_gen, "");
    _builder.append(")))");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence gen(final Query item) {
    StringConcatenation _builder = new StringConcatenation();
    Predicate _predicate = item.getPredicate();
    CharSequence _gen = this.gen(_predicate);
    _builder.append(_gen, "");
    _builder.append(" ");
    EList<Predicate> _nthPredicate = item.getNthPredicate();
    final Function1<Predicate, CharSequence> _function = new Function1<Predicate, CharSequence>() {
      public CharSequence apply(final Predicate it) {
        return PrologGenerator.this.gen(it);
      }
    };
    List<CharSequence> _map = ListExtensions.<Predicate, CharSequence>map(_nthPredicate, _function);
    String _join = IterableExtensions.join(_map, " ");
    _builder.append(_join, "");
    return _builder;
  }
  
  public CharSequence gen(final Clause item) {
    Fact _fact = item.getFact();
    boolean _notEquals = (!Objects.equal(_fact, null));
    if (_notEquals) {
      Fact _fact_1 = item.getFact();
      return this.gen(_fact_1);
    }
    Rule _rule = item.getRule();
    boolean _notEquals_1 = (!Objects.equal(_rule, null));
    if (_notEquals_1) {
      Rule _rule_1 = item.getRule();
      return this.gen(_rule_1);
    }
    return null;
  }
  
  public CharSequence gen(final Fact item) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Predicate _predicate = item.getPredicate();
    CharSequence _gen = this.gen(_predicate);
    _builder.append(_gen, "");
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence gen(final Rule item) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Predicate _predicate = item.getPredicate();
    CharSequence _gen = this.gen(_predicate);
    _builder.append(_gen, "");
    _builder.append(" ");
    Query _query = item.getQuery();
    CharSequence _gen_1 = this.gen(_query);
    _builder.append(_gen_1, "");
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence gen(final Predicate item) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _functor = item.getFunctor();
    _builder.append(_functor, "");
    _builder.append(" ");
    Term _term = item.getTerm();
    CharSequence _gen = this.gen(_term);
    _builder.append(_gen, "");
    _builder.append(" ");
    EList<Term> _nthTerm = item.getNthTerm();
    final Function1<Term, CharSequence> _function = new Function1<Term, CharSequence>() {
      public CharSequence apply(final Term it) {
        return PrologGenerator.this.gen(it);
      }
    };
    List<CharSequence> _map = ListExtensions.<Term, CharSequence>map(_nthTerm, _function);
    String _join = IterableExtensions.join(_map, " ");
    _builder.append(_join, "");
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence gen(final Term item) {
    Atom _atom = item.getAtom();
    boolean _notEquals = (!Objects.equal(_atom, null));
    if (_notEquals) {
      Atom _atom_1 = item.getAtom();
      return _atom_1.getAtom();
    }
    de.htwdd.sf.beleg.s74838.prolog.List _list = item.getList();
    boolean _notEquals_1 = (!Objects.equal(_list, null));
    if (_notEquals_1) {
      de.htwdd.sf.beleg.s74838.prolog.List _list_1 = item.getList();
      return this.gen(_list_1);
    }
    return null;
  }
  
  public CharSequence gen(final de.htwdd.sf.beleg.s74838.prolog.List item) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    NotEmptyList _list = item.getList();
    Folge _folge = _list.getFolge();
    CharSequence _gen = this.gen(_folge);
    _builder.append(_gen, "");
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence gen(final Folge item) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(cons ");
    Atom _atom = item.getAtom();
    _builder.append(_atom, "");
    _builder.append(" ())");
    _builder.newLineIfNotEmpty();
    String _xifexpression = null;
    EList<Atom> _nthAtom = item.getNthAtom();
    boolean _notEquals = (!Objects.equal(_nthAtom, null));
    if (_notEquals) {
      EList<Atom> _nthAtom_1 = item.getNthAtom();
      final Function1<Atom, CharSequence> _function = new Function1<Atom, CharSequence>() {
        public CharSequence apply(final Atom it) {
          return PrologGenerator.this.specialAtom(it);
        }
      };
      List<CharSequence> _map = ListExtensions.<Atom, CharSequence>map(_nthAtom_1, _function);
      _xifexpression = IterableExtensions.join(_map);
    }
    _builder.append(_xifexpression, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence specialAtom(final Atom item) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(cons ");
    String _atom = item.getAtom();
    _builder.append(_atom, "");
    _builder.append(" ())");
    return _builder;
  }
}
