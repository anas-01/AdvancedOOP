/**
 * Object-Oriented Programming Assignment
 * Design Patterns 
 */
package racinggame;

import java.util.Random;
import java.util.Scanner;

public class RacingGame {

    public static void main(String[] args) {

        Scanner kbinput = new Scanner(System.in);
        Random rand = new Random();

        String pName;
        String play = "x";
        String power = "z";
        int playersRequired;
        int currentLap = 1;
        int lapsRequired;

        System.out.println("Enter your username ");
        pName = kbinput.next();
        System.out.println("");

        Player p1 = Player.getInstance(pName);
        System.out.println("Player Name: " + p1.playerName);
        System.out.println("");

        //Creating a car for the player with attachment
        p1.createCar();

        System.out.println("How many laps would you like to play?");
        lapsRequired = kbinput.nextInt();

        while (!play.equalsIgnoreCase("S")) {
            System.out.println("To start the race press S: ");
            play = kbinput.next();
        }

        System.out.println("Enter how many players you would like to play with: Max 3 ");
        playersRequired = kbinput.nextInt();

        //Creating the other players
        MarioKart mario = new MarioKart();
        Yoshi yoshi = new Yoshi();
        Bowser bow = new Bowser();

        if (playersRequired == (1)) {
            System.out.print("You are playing against: ");
            mario.createMarioKart();
        }
        if (playersRequired == (2)) {
            System.out.print("You are playing against: ");
            mario.createMarioKart();
            System.out.println("");
            yoshi.createYoshiCar();
        }

        if (playersRequired == (3)) {
            System.out.print("You are playing against: ");
            mario.createMarioKart();
            System.out.println("");
            yoshi.createYoshiCar();
            System.out.println("");
            bow.createBowserCar();
        }

        while (currentLap <= lapsRequired) {

            int randomNumber = rand.nextInt(15 + 1 - 1) + 1;;

            System.out.println("--------------------");
            System.out.println("Lap number: " + currentLap);
            System.out.println(p1.playerName + " has travelled " + randomNumber + " miles ");
            p1.fuelLevel();
            System.out.println("Fuel Level: " + p1.fuel + "%");

            System.out.println("");
            System.out.println(mario.getDescription() + "has travelled " + mario.distance() + " miles ");
            System.out.println("Fuel level: " + mario.fuelLevel() + "%");

            System.out.println("");

            currentLap = currentLap + 1;

                if (currentLap == 3) {
                    while (!power.equalsIgnoreCase("P")) {
                        System.out.println(currentLap + " laps have been, you are able to power up! Press P to power up ");
                        System.out.println("");
                        System.out.println("NOTE: this will use more fuel");
                        power = kbinput.next();
                    }
                    p1.powerUp();
                    System.out.println("Health increased to: " + p1.health + "Hp");
                }
                
               

            }
        
        

        }

    }
