package org.lessons.kotlin.scores

import java.util.*
import kotlin.collections.HashMap

class ScoresRegister {
    val id: String = UUID.randomUUID().toString();  //unique id(128bit)
    // scores = HashMap<String, Scores>();  //O(1), accesso diretto con Id

    private val scoresMap: MutableMap<String, Scores> = mutableMapOf()

    fun searchScores(theidconfirmedplayer:String):Unit{
        val targetscores = scoresMap[theidconfirmedplayer];
        if(targetscores!=null){
            targetscores.getScoresPlayer();
        }else {
            println("Scores of the target player not found.");
        }
    }
}