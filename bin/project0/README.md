#Project0

##Analyse0

Analyse0 sostituisce il file "Analyse" nel package "analyser".

Al suo interno vi è solo la chiamata al lexer ed è stato aggiunto l'invocazione al listener da noi creato per catturare
gli errori sintattici. La chiamata "getAllToken()"  è stata inserita per forzare il controllo sui token.
In questo modo, in caso di errori sintattici, il controllo passerà al listener da noi implementato.

##Listener

Listener estende la classe BaseErrorListener e, quando rileva un errore sintattico lo stampa a video.
Inoltre è stato preparata la lista di errori, "errors", in caso sia necessario recuperarli in un secondo momento. 
 