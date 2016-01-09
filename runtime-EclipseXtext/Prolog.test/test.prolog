vater_von(paul,peter).
vater_von(peter,otto).
vater_von(peter,ines).
vater_von(otto,leo).
grossvater_von(X,Z):- vater_von(X,Y),vater_von(Y,Z).
?- grossvater_von(U,V).