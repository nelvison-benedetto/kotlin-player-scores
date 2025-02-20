package org.lessons.kotlin.scores
import java.util.UUID

class Scores(
    val username: String,
    var score: Int,
    var playingtime: Long,  //suitable x time very very long
){  //info scores this game who-punteggio-tempo

    val id: String = UUID.randomUUID().toString();  //unique id(128bit)
    fun getIdScoreUnivoque():String{ return id;}

    fun printScoresPlayer():Unit{
        println("Username: $username, Score: $score, Playingtime: $playingtime");
    }
}
