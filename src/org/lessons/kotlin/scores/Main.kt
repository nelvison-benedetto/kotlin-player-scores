package org.lessons.kotlin.scores

fun main() {
    //create player, store player
    val regPlayers = PlayerRegister();
    val regScores = ScoresRegister();
    var isRunning = true;
    while(isRunning) {
        println("Please choose as option:");
        print("1. Add a player. \n2. Login .\n3. Print all players.\n4. Exit.\n");
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

                    val idplayercreated = regPlayers.createPlayer(name, lastname, nationality, googleaccount, phonenumber);

                    print("Insert your username: ");
                    val username = readLine() ?:"";
                    println("Your personal id: $idplayercreated");
                    regScores.createScores(idplayercreated,username);
                }
                2->{
                    print("Insert your id: ");
                    val theid = readLine()?:"";
                    val confirmedidplayer = regPlayers.searchPlayer(theid);
                    if(confirmedidplayer != "") {
                        println("Confirmed existing player id ${confirmedidplayer}");
                        //ora ho l'id del giocatore che ho cercato tramite id
                        regScores.searchScores(confirmedidplayer);

                        //continue gaming
                        println("Do you want continue the Game?");
                        val choicecontinuegame = readLine()?:"";
                        if (choicecontinuegame.trim().equals("y", ignoreCase = true)){  //ignore uppercase
                            val playerscores = regScores.getScoresPlayer(confirmedidplayer);
                            if(playerscores!=null){
                                val game1= Game(playerscores);
                                game1.runGame();
                            }
                        }
                    }else {println("Player not found.")}
                }
                3->{
                    println("Print all players");
                    regPlayers.printAllPlayers();
                }
                4->{
                    println("Exiting...");
                    isRunning = false;
                }
                else->{println("Input non valid. Returning to home...");}  //default
            }
        }
        else{
            println("Input non valid. Returning to home...");
        }
    }
    println("Bye...");
}