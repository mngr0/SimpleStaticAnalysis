#Project0

##Group
Il gruppo è formato da Simone Berni e Marco Negrini

##Implementazione
È sufficiente inserire il package nella cartella "src" del progetto ed eseguire il main del file Analyse0

##Analyse0
È stato rimosso tutto ciò che non era rilevante al progetto0, mantenendo perciò solamente il lexer.
A questo punto è stato rimosso il precedente listener degli errori ed è stato aggiunto quello da noi creato.
Successivamente è stata invocata la procedura getAllTokens() per forzare il controllo sintattico del testo in input
e poter in questo modo rilevare errori sintattici.
Infine se sono stati trovati degli errori, essi sono scritti su un file e a video


##Listener

Listener estende la classe BaseErrorListener e, quando rileva un errore sintattico
lo inserisce nella lista "errors". Quando la procedura writeErrors() è invocata, se
è presente almeno un errore viene creato il file SyntaxErrors nella radice del progetto
e al suo interno sono inseriti gli errori riscontrati. Per completezza è stata effettuata 
anche la stampa a video.
