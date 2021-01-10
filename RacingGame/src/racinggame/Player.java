package racinggame;

public class Player {

    String playerName;
    int health = 50;
    int fuel = 50;
    private static Player playa;

    /**
     * Private constructor for the Singleton
     * @param playerName String player name
     */
    private Player(String playerName) {
        this.playerName = playerName;
        System.out.println("New Player Created!");
    }
    
    /**
     * Creating an instance of the player 
     * @param pName String player name
     * @return  Player Instance of the player
     */
    public static Player getInstance(String pName) {
        if (playa == null) {
            playa = new Player(pName);
        }
        return playa;
    }
    
    /**
     * Generating a car for the user
     */
    public void createCar() {
        Cars p1Car = new PlayersCar();
        p1Car = new GreenShell(p1Car);
        System.out.println("New car generated for: " + playerName);
        System.out.println(p1Car.getDescription() + p1Car.getWeight() + "Kg");
        System.out.println("Current fuel level: " + fuel + "%");
        System.out.println("");
    }

    /**
     * Method to increase user's health
     */
    public void powerUp() {
        System.out.println("You are in boost mode!");
        health = health + 50;
    }

    /**
     * Decreases fuel level and checks the fuel level
     */
    public void fuelLevel() {
        fuel = fuel - 4;
        if (fuel <= 0) {
            System.out.println("YOU RAN OUT OF FUEL END OF GAME!");
            System.exit(0);
        }
    }

}
