package day_10_switch_logical_operators;

public class LeasingOffice {
    public static void main (String [] args) {
        System.out.println("Welcome to CyberTek School appartments!");
        int numberOfBedrooms = 10;
        double startingPrice = 0.0;
        switch (numberOfBedrooms){
            case 0:
                System.out.println("Studio is selected");
                startingPrice =1200.0;
                break;
            case 1:
                System.out.println("One bedroom is selected");
                startingPrice = 1400.0;
                break;
            case 2:
                System.out.println("Two bedrooms is selected");
                startingPrice = 1650.0;
                break;
            case 3:
                System.out.println("Three bedroom is selected");
                startingPrice = 2250.0;
                break;
            default:
                System.out.println("No such a bedroom available.");



        }
        System.out.println(" Starting Price is $: "+startingPrice);
        if (startingPrice > 1300.0){
            System.out.println("Too much expensive! Bye!");
        }
        //if (startingPrice < 1250){
          //  System.out.println("Good price! Lets make an agreement");
        //}
    }
}
