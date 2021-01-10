package racinggame;

public class GreenShell extends ItemDecorator {

    Cars cars;

    public GreenShell(Cars cars) {
        this.cars = cars;
    }
    
    
    public String getDescription() {
        return cars.getDescription() + " with green shell, ";
    }


    @Override
    public int addFuel() {
        return 0 + cars.addFuel();
    }

    @Override
    public void speed() {

    }

    @Override
    public void power() {

    }

    @Override
    public double getWeight() {
        return 0.87 + cars.getWeight();
    }
    
    public int fuelLevel() {
        return fuel = fuel - 10;

    }

    @Override
    public int distance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
