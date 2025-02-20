package org.lessons.kotlin.scores

import java.util.*
import kotlin.collections.HashMap

class ScoresRegister {
    val id: String = UUID.randomUUID().toString();  //unique id(128bit)
    // scores = HashMap<String, Scores>();  //O(1), accesso diretto con Id

    private val scoresMap: MutableMap<String, Scores> = mutableMapOf()

    fun createScores(idplayercreated:String, username:String):Unit{
        if(scoresMap.containsKey(idplayercreated)){
            println("Scores already existing.");
            searchScores(idplayercreated);
        }
        else{
            val newscores = Scores(username, score=0, playingtime=0);
            scoresMap[idplayercreated] = newscores;
            searchScores(idplayercreated);  //also without this.
        }
        //BETTER logic, avoid redundancy containsKey+put
        //scoresMap.putIfAbsent(idPlayerCreated, Scores(username, score = 0, playingtime = 0))
        // ?.also { println("Scores already exist.") } // safe condition
        // ?: searchScores(idPlayerCreated) // elvis operator
    }
    fun getScoresPlayer(idplayer:String):Scores? {  //return res or NULL!
        return scoresMap[idplayer];
    }
    fun searchScores(theconfirmedidplayer:String):Unit{
        scoresMap[theconfirmedidplayer]?.printScoresPlayer() ?: println("Scores of the target player not found.");
           //primo ?(senza ':', è 'safe call') se è !=null continua con .printScoresPlayer(), altrimenti passa a :?(elvis operator)!
    }
}