package racinggame;

import racinggame.Cars;
import racinggame.GreenShell;

public class Yoshi extends Cars {
    
      int randomNumber = rand.nextInt(); 

    public Yoshi() {
        description = "Yoshi";
    }

    @Override
    public int addFuel() {
        return 50;
    }

    @Override
    public void speed() {

    }

    @Override
    public void power() {
        System.out.println("Moved into the lead!");

    }

    @Override
    public double getWeight() {
        return 4;
    }

    public void createYoshiCar() {
        Cars yoshi = new Yoshi();
        yoshi = new GreenShell(yoshi);
        System.out.println(yoshi.getDescription() + yoshi.getWeight() + "Kg");
        System.out.println("Current fuel level: " + yoshi.addFuel() + "%");
    }

    public int fuelLevel() {
        return fuel = fuel - 3;

    }

    @Override
    public int distance() {
        return randomNumber = rand.nextInt(5 + 1 - 1) + 1;
    }

}
