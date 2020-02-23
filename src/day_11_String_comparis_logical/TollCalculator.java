package day_11_String_comparis_logical;

public class TollCalculator {
    public static void main(String[] args) {
        String vehicleType = "car";
        boolean isRushHour = true;
        double tollPrice = 0;
        if (vehicleType.equalsIgnoreCase("car") && !isRushHour)  { //isRushHour == false possible
            tollPrice = tollPrice +3.0;

        }else if (vehicleType.equalsIgnoreCase("car") && isRushHour){
            tollPrice = tollPrice + 7.5;
        }else if (vehicleType.equalsIgnoreCase("truck") && isRushHour ==false){
            tollPrice = tollPrice + 4.75;
        }else if (vehicleType.equalsIgnoreCase("truck") && isRushHour){
            tollPrice = tollPrice + 10;
            if (tollPrice > 9) {
                System.out.println("The toll is expensive");
            }
        } else {
            System.out.println("Vehicle not recognized. Use no toll rout.");

        }
        System.out.println(tollPrice);

    }
}
