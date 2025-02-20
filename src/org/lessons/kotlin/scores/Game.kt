package org.lessons.kotlin.scores

import kotlin.system.measureTimeMillis

class Game (  //chek also public/private/protected in the other classes
    private val playerscores: Scores
){
    fun runGame() {
        println("Welcome back ${playerscores.username}! Your current score is ${playerscores.score}, and you've played for ${playerscores.playingtime} ms.");
        var isPlaying = true;

        while(isPlaying){
            val elapsedTime = measureTimeMillis {
                println("Qual è il fiume più lungo del mondo?");
                println("1) Mississippi   2) Amazzonia  3) Gange   4) Nilo");
                val answer1 = readLine()?.trim()?.lowercase() ?: "";
                if (answer1 == "4") {
                    println("Correct!");
                    playerscores.score += 10;
                } else {println("Wrong! The correct answer was 'b'.");}

                println("Quante lingue si parlano in America?");
                println("1) 1  2) 2  3) 3  4) 4");
                val answer2 = readLine()?.trim()?.lowercase() ?: "";
                if (answer2 == "3") {
                    println("Correct!");
                    playerscores.score += 10;
                } else {println("Wrong! The correct answer was 'b'.");}

                println("Qual'è il birthrate dell'Italia?");
                println("1) 1.24  2) 2.2  3) 3.6  4) 4.1");
                val answer3 = readLine()?.trim()?.lowercase() ?: "";
                if (answer3 == "1") {
                    println("Correct!");
                    playerscores.score += 10;
                } else {println("Wrong! The correct answer was 'b'.");}

            }
            playerscores.playingtime += elapsedTime;

            println("Do you want to continue the game?(y/n)");
            val choice = readLine()?.trim()?.lowercase() ?: "";
            if (choice.trim().equals("n", ignoreCase = true)){isPlaying=false;}
        }
        println("Final score: ${playerscores.score}, Total playing time: ${playerscores.playingtime} ms.")
    }
}