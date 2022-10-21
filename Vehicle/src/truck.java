public class truck extends Vehicle {

    public truck() {
        super(3,2,6,4,2,80,"OFF");
    }

    public truck(int seats,int doors, int wheels, int frontLights, int backLights, int fuelTank, String engine) {
        super(seats,doors, wheels, frontLights, backLights, fuelTank, engine);
    }

    @Override
    public String toString() {
        return "Truck Details: " 
        + "\nseats = " + getSeats()
        + "\nDoors = " + getDoors()
        + "\nWheels = " + getWheels() 
        + "\nFront Lights = " + getFrontLights() 
        + "\nBack Lights = " + getBackLights()
        + "\nFuel Tank = " + getFuelTank()
        + "\nEngine = " + getEngine();
    }
    






}
