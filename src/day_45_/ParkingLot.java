package day_45_;

public class ParkingLot {

    public static void main(String[] args) {
        //print number of vehicle static way
        System.out.println(Vehicle.numberOfVehicle);
        //System.out.println(Vehicle.model); it is non static
        Vehicle v1 = new Vehicle("tesla cybertruck");
        System.out.println(Vehicle.numberOfVehicle);
        System.out.println(v1.numberOfVehicle);
        Vehicle v2= new Vehicle("Ford f150");
        System.out.println(Vehicle.numberOfVehicle);
        System.out.println(v2.numberOfVehicle);

        Vehicle.numberOfVehicle = 10;
        System.out.println(v1.numberOfVehicle);
        System.out.println(v2.numberOfVehicle);

        Vehicle v3 = new Vehicle("Chevy Silverado"); //vehicle constructor runs
        System.out.println(Vehicle.numberOfVehicle);
        System.out.println(v1.numberOfVehicle);
        System.out.println(v2.numberOfVehicle);
        System.out.println(v3.numberOfVehicle);

        v2.numberOfVehicle = 300;
        System.out.println(Vehicle.numberOfVehicle);
        System.out.println(v1.numberOfVehicle);
        System.out.println(v2.numberOfVehicle);
        System.out.println(v3.numberOfVehicle);


        System.out.println(v1.getModel()); /*if model was static v1,v2,v3 would be chevy silverado, else they will be different*/
        System.out.println(v2.getModel());
        System.out.println(v3.getModel());

        v1.setModel("BMW 530i");

        System.out.println(v1.getModel()); /*if model was static v1,v2,v3 would be chevy silverado, else they will be different*/
        System.out.println(v2.getModel());
        System.out.println(v3.getModel());



    }

}
