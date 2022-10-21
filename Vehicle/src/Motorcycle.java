public class Motorcycle extends Vehicle {
    
private int storagebox;

public Motorcycle() {
    super(2,0, 2, 2, 2, 25,"OFF");
    this.storagebox = 1;
}

public Motorcycle(int storagebox) {
    super();
    this.storagebox = storagebox;
}

public void setStoragebox(int storagebox) {
    this.storagebox = storagebox;
}

@Override
public String toString() {
    return "Motorcycle Details: " 
    + "\nseats = " + getSeats()
    + "\nStorage Box = " + storagebox
    + "\nDoors = " + getDoors()
    + "\nWheels = " + getWheels() 
    + "\nFront Lights = " + getFrontLights() 
    + "\nBack Lights = " + getBackLights()
    + "\nFuel Tank = " + getFuelTank()
    + "\nEngine = " + getEngine();


    }
}
