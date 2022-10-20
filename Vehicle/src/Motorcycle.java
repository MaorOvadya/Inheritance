public class Motorcycle extends Vehicle {
    
private int seats;

public Motorcycle() {
    this.seats = 2;
}

public Motorcycle(int seats) {
    super(0, 2, 2, 2);
    this.seats = seats;
}

public void setSeats(int seats) {
    this.seats = seats;
}

@Override
public String toString() {
    return "Motorcycle Details: " 
    + "\nseats = " + seats 
    + "\nDoors = " + getDoors()
    + "\nWheels = " + getWheels() 
    + "\nFront Lights = " + getFrontLights() 
    + "\nBack Lights = " + getBackLights();
}






}
