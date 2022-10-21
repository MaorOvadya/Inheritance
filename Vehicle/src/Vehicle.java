public class Vehicle {

    private int doors;
    private int wheels;
    private int frontLights;
    private int backLights;
    private int fuelTank;
    private String engine;
    private int seats;
    
    public Vehicle() {
        this.doors = 4;
        this. wheels = 4;
        this.seats = 5;
        this. frontLights = 2;
        this.backLights = 2;
        this.fuelTank = 45;
        this.engine = "OFF";
    }
    
    public Vehicle(int seats,int doors,int wheels, int frontLights, int backLights,int fuelTank,String engine) {
        this.doors = doors;
        this.wheels = wheels;
        this.frontLights = frontLights;
        this.backLights = backLights;
        this.fuelTank = fuelTank;
        this.engine = engine;
        this.seats = seats;
    }
    
    public int getSeats(){
        return this.seats;
    }
    
    public int getDoors(){
        return this.doors;
    }
    
    public void setDoors(int doors) {
        this.doors = doors;
    }
    
    public int getWheels() {
        return wheels;
    }
    
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    
    public int getFrontLights() {
        return frontLights;
    }
    
    public void setFrontLights(int frontLights) {
        this.frontLights = frontLights;
    }
    
    public int getBackLights() {
        return backLights;
    }
    
    public void setBackLights(int backLights) {
        this.backLights = backLights;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }
    
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle Details:"
         + "\ndoors = " + doors +
          "\nwheels = " + wheels +
           "\nfront Lights = " + frontLights + 
           "\nback Lights = " + backLights +
           "\nFuel Tank: " + fuelTank +
           "\nEngine: " + engine;
    }

    }