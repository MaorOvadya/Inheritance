public class App {
    public static void main(String[] args) throws Exception {
            Vehicle vehicle = new Vehicle();
            System.out.println(vehicle.toString());
            System.out.println("<==========================>");
            Vehicle bike = new Motorcycle();
            System.out.println(bike.toString());
            System.out.println("<==========================>");
            Vehicle truck = new truck();
            System.out.println(truck.toString());
    }
}