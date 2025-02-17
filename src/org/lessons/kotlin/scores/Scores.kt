package org.lessons.kotlin.scores
import java.util.UUID

class Scores(
    val username: String,
    val score: Int,
    val playingtime: Long,  //suitable x time very very long
){  //info scores this game who-punteggio-tempo
    val id: String = UUID.randomUUID().toString();  //unique id(128bit)

    fun getScoresPlayer():Unit{
        println("Username: $username, Score: $score, Playingtime: $playingtime");
    }
}

/* Creare una classe Player con:
Un nome completo
Un elenco di punteggi per i vari livelli giocati
Un metodo per aggiornare e mostrare i punteggi
✅ Aggiungere un metodo per calcolare il miglior punteggio ottenuto in un livello.
✅ Creare più giocatori e simulare l'inserimento dei punteggi.
✅ Mostrare il vincitore e stampare il punteggio finale in console con due linee di testo, ad esempio:
 */