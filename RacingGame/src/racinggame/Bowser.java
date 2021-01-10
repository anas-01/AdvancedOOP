package racinggame;

public class Bowser extends Cars {

    public Bowser() {
        description = "I am Bowser >:| ";
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
        System.out.println("Smash!");

    }

    @Override
    public double getWeight() {
        return 12;
    }

    public int fuelLevel() {
        return fuel = fuel - 12;

    }

    public void createBowserCar() {
        Cars bowser = new Bowser();
        System.out.println(bowser.getDescription() + bowser.getWeight() + "Kg");
        System.out.println("Current fuel level: " + bowser.addFuel() + "%");
    }

    @Override
    public int distance() {
        return 0;
        
    }

}
