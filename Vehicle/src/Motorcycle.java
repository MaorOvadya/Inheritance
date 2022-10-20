public class Motorcycle extends Vehicle {
    
private int seats;
private int storagebox;

public Motorcycle() {
    super(0, 2, 2, 2, 25);
    this.seats = 2;
    this.storagebox = 1;
}

public Motorcycle(int seats, int storagebox) {
    super();
    this.seats = seats;
    this.storagebox = storagebox;
}

public void setSeats(int seats) {
    this.seats = seats;
}

public void setStoragebox(int storagebox) {
    this.storagebox = storagebox;
}

@Override
public String toString() {
    return "Motorcycle Details: " 
    + "\nseats = " + seats 
    + "\nStorage Box = " + storagebox
    + "\nDoors = " + getDoors()
    + "\nWheels = " + getWheels() 
    + "\nFront Lights = " + getFrontLights() 
    + "\nBack Lights = " + getBackLights()
    + "\nFuel Tank = " + getFuelTank();

    }
}
