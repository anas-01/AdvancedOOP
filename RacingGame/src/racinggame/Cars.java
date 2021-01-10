package racinggame;

import java.util.Random;

public abstract class Cars {

    Random rand = new Random();

    //int randomNumber = rand.nextInt(49 + 1 - 1) + 1;
    public String description;
    public int fuel = 50;

    public String getDescription() {
        return description;
    }

    public abstract int distance();

    public abstract int addFuel();

    public abstract int fuelLevel();

    public abstract void speed();

    public abstract void power();

    public abstract double getWeight();

}
