package de.htwdd.sf.beleg.s74838.generator
import de.htwdd.sf.beleg.s74838.prolog.Atom
import de.htwdd.sf.beleg.s74838.prolog.Clause
import de.htwdd.sf.beleg.s74838.prolog.Fact
import de.htwdd.sf.beleg.s74838.prolog.Folge
import de.htwdd.sf.beleg.s74838.prolog.List
import de.htwdd.sf.beleg.s74838.prolog.Predicate
import de.htwdd.sf.beleg.s74838.prolog.PrologDsl
import de.htwdd.sf.beleg.s74838.prolog.Query
import de.htwdd.sf.beleg.s74838.prolog.Rule
import de.htwdd.sf.beleg.s74838.prolog.Term
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class PrologGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {		
		for(e:resource.allContents.toIterable.filter(typeof(PrologDsl)))
		{
			System::out.println("Start der Transformation \n")					
			fsa.generateFile("prologDsl.lsp",e.gen)
		}
	}
	
	def gen(PrologDsl item)'''
		(prolog (quote (
			«item.program.clause.map[gen].join('\n')»	
		))
		(quote («item.exquery.query.gen»)))
	''' 						
	
	def gen(Query item)
	'''«item.predicate.gen» «item.nthPredicate.map[gen].join(' ')»'''
	
	def gen(Clause item){
		if(item.fact != null) return item.fact.gen
		if(item.rule != null) return item.rule.gen
	}
	
	def gen(Fact item)
	'''(«item.predicate.gen»)'''
	
	def gen(Rule item)
	'''(«item.predicate.gen» «item.query.gen»)'''
	
	def gen(Predicate item)
	'''(«item.functor» «item.term.gen» «item.nthTerm.map[gen].join(' ')»)'''
	
	def gen(Term item){
		if(item.atom != null ) return item.atom.atom
		if(item.list != null ) return item.list.gen
	}
	
	def gen(List item)'''(«item.list.folge.gen»)'''
	
	def gen(Folge item)'''
		(cons «item.atom» ())
		«if(item.nthAtom != null) item.nthAtom.map[specialAtom].join»
	'''
	
	def specialAtom(Atom item)
	'''(cons «item.atom» ())'''	
}