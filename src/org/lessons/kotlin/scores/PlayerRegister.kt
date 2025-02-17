package org.lessons.kotlin.scores
import java.util.*
import kotlin.collections.HashMap

class PlayerRegister {
    val id: String = UUID.randomUUID().toString();  //unique id(128bit)
    val players = HashMap<String, Player>();  //O(1), accesso diretto con Id

    fun createPlayer(name:String, lastname:String, nationality:String, googleaccount:String, phonenumber:Int):Unit{
        val player = Player(name,lastname,nationality,googleaccount,phonenumber);
        players[player.getIdPlayer()] = player;  //add in hashmap
    }
    fun searchPlayer(theid:String):String{
        val targetplayer = players[theid];
        if(targetplayer!=null){
            val confirmedidplayer = targetplayer.getIdPlayer();
            println("Id confermato esistente: $confirmedidplayer")
            val confirmedplayer = targetplayer;
            return confirmedidplayer;
        }else{
            println("Player not found. Returning to home...")
        }
    }
}