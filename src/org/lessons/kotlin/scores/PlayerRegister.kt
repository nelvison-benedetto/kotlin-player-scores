package org.lessons.kotlin.scores
import java.util.*
import kotlin.collections.HashMap

class PlayerRegister {
    val id: String = UUID.randomUUID().toString();  //unique id(128bit)
    val playersMap = HashMap<String, Player>();  //O(1), accesso diretto con Id, INFO ALL MAPS(hash,mutable,ect) IN JAVA!

    fun createPlayer(name: String, lastname: String, nationality: String, googleaccount: String, phonenumber: Int): String{
        val player = Player(name, lastname, nationality, googleaccount, phonenumber)  // Rimosso regPlayers, regScores
        playersMap[player.getIdPlayer()] = player;
        return player.getIdPlayer();
    }
    fun searchPlayer(theid:String):String{
        return playersMap[theid]?.getIdPlayer()?:"";
    }
    fun printAllPlayers():Unit{
        playersMap.forEach{(key,value)->
            println("Id: $key, Player: $value");
        };
    }
}