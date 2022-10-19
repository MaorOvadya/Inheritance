public class Vehicle {

    private int doors;
    private int wheels;
    private int frontLights;
    private int backLights;
    
    public Vehicle() {
        this.doors = 4;
        this. wheels = 4;
        this. frontLights = 2;
        this.backLights = 2;
    }
    
    public Vehicle(int doors,int wheels, int frontLights, int backLights) {
        this.doors = doors;
        this.wheels = wheels;
        this.frontLights = frontLights;
        this.backLights = backLights;
    }
    
    public void engineStart(){
        System.out.println("Engine start....3...2...1....Vroom, vroom");
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
    
    @Override
    public String toString() {
        return "Vehicle Details:"
         + " \ndoors = " + doors +
          "\nwheels = " + wheels +
           "\nfrontLights = " + frontLights + 
           "\nbackLights = " + backLights;
    }
    
    }