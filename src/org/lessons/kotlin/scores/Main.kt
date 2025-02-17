package org.lessons.kotlin.scores

fun main() {
    //create player, store player
    val regPlayers = PlayerRegister();
    val regScores = ScoresRegister();

    while(true) {
        println("Welcome, please choose as option:");
        print("1. Add a player. \n2. Search a player.\n3. Exit.\n4.Print all players");
        val choice = readLine()?.toIntOrNull()?: 0;
        if(choice != 0){
            when(choice){
                1->{
                    print("Insert the name: ");
                    val name = readLine() ?:"";  //readLine read str, set "" if value at sx of ? is null!
                    print("Insert the lastname: ");
                    val lastname = readLine() ?:"";
                    print("Insert the nationality: ");
                    val nationality = readLine() ?:"";
                    print("Insert the google account: ");
                    val googleaccount = readLine() ?:"";
                    print("Insert the phone number: ");
                    val phonenumber = readLine() ?.toIntOrNull()?:0;
                    regPlayers.createPlayer(name,lastname,nationality,googleaccount,phonenumber,regPlayers, regScores);
                }
                2->{
                    print("Insert the id: ");
                    val theid = readLine()?:"";
                    val confirmedidplayer = regPlayers.searchPlayer(theid);
                    regScores.searchScores(confirmedidplayer);
                }
                3->{
                    println("Exiting...");
                }
                4->{  //print all players

                }
                else->{println("Input non valid. Returning to home...");}
            }
        }
        else{
            println("Input non valid. Returning to home...");
        }
    }
}