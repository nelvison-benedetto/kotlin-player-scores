package org.lessons.kotlin.scores
import java.util.*

class Player(  //info player
    val name: String,
    val lastname: String,
    val nationality: String,
    val googleaccount : String,
    val phonenumber : Int,
    private val regScores: ScoresRegister,  // Registri passati al costruttore
    private val regPlayers: PlayerRegister,
){
    val id: String = UUID.randomUUID().toString();  //unique id(128bit)
    fun getIdPlayer():String{
        return id;
    }
    //store time of playing
}