package replitExamples;

public class Parking {
    public static void main(String[] args) {
        ParkingMeter pm =new ParkingMeter(10);
        System.out.println(pm.add(20));
        System.out.println(pm.isExpired());



    }
}
