package racinggame;

import racinggame.Cars;
import racinggame.GreenShell;

public class MarioKart extends Cars {

    int randomNumber = rand.nextInt();

    public MarioKart() {
        description = "Mario Kart ";
    }

    @Override
    public int addFuel() {
        return 50;

    }

    @Override
    public void speed() {

    }

    /**
     * Method for the characters to power
     */
    @Override
    public void power() {
        System.out.println("Powered Up!");
    }

    /**
     * Displays the weight of the car
     * @return weight of MarioKart vehicle 
     */
    public double getWeight() {
        return 8;
    }

    /**
     * Generating a car for MarioKart with default attachments
     */
    public void createMarioKart() {
        Cars mario = new MarioKart();
        mario = new GreenShell(mario);
        System.out.println(mario.getDescription() + mario.getWeight() + "Kg");
        System.out.println("Current fuel level: " + mario.addFuel() + "%");
    }

    /**
     * Decreases the fuel level 
     * @return Fuel Level 
     */
    public int fuelLevel() {
        return fuel = fuel - 6;

    }

    /**
     * Generates a random number between 1 and 10
     * @return A random number
     */
    @Override
    public int distance() {
        return randomNumber = rand.nextInt(10 + 1 - 1) + 1;
    }

}
