auf(a,1).
auf(1,2). 
auf(b,3).
auf(c,4).
auf(4,5).
auf(5,6).
ueber(X,Y):-auf(X,Y).
ueber(X,Y):-ueber(Z,Y),auf(X,Z).
?- ueber(X,Y).