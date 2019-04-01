#Project1
#Group
Il gruppo e' formato da Simone Berni e Marco Negrini

#Implementazione
E' sufficiente sostituire i file nei package corrispondenti. I file principali sono 3: 
- Analyze1 sostituisce Analyze
- SimpleVisitorImpl sostituisce l'omonimo
- Simple.g4 sostituisce l'omonimo
Per completezza e' stato inserito anche tutto il parser creato dalla grammatica,
poiche' e' stato effettuato un upgrade di versione di ANTLR da 4.6 alla ultima 
release 4.7.2 . Per completezza e' stato anche inserito il jar utilizzato per l'esecuzione runtime

#Analyse1
Ad analyse1 e' stata rimossa la parte di analisi semantica e comportamentale
che non e' rilevante al fine della consegna. Sono state aggiunte le stampe e le funzioni relative 
al conteggio delle funzioni dichiarate e alla presenza o menon di dichiarazioni doppie.

#Simple.g4
Per la sintassi e' stato preso come esempio Python 

#SimpleVisitorImpl

Sono stati aggiunti i controlli della funzione, dei suoi parametri, dell'ifthenelse e infine delle dichiarazioni.
Ogni metodo ritorna NULL e non la corrispettiva SimpleStmtClass poiche' non vi e' necessita' per questa consegna
in quanto non e' necessaria ne l' analisi semantica ne quella comportamentale.
E' stato inoltre aggiunta alla classe una hashmap che contiene le dichiarazioni delle variabili e delle funzioni al suo interno
e un contatore di funzioni, rispettivamente per la consegna dell'esercizio 3 e 2.
