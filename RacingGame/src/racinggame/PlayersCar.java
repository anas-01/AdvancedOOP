package racinggame;

public class PlayersCar extends Cars {

    

    public PlayersCar() {
        description = "Your car";
    }

    @Override
    public int addFuel() {
        return 23;
    }

    @Override
    public void speed() {
    }

    @Override
    public void power() {

    }

    @Override
    public double getWeight() {
        return 12;
    }

    public int fuelLevel() {
        return fuel = fuel - 10;

    }

    @Override
    public int distance() {
        return 0;
    }

}
