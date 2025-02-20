package org.lessons.kotlin.scores
import java.util.*

class Player(  //info player
    val name: String,  //are all public!
    val lastname: String,
    val nationality: String,
    val googleaccount : String,
    val phonenumber : Int,
){
    val id: String = UUID.randomUUID().toString();  //unique id(128bit)
    fun getIdPlayer():String{
        return id;
    }
}