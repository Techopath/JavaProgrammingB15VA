package replitExamples;
import java.util.*;
public class LaptopConfigurator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter screen size: ");
        double screenSize = scan.nextDouble();
        System.out.println("Enter CPU type like i3, i5, i7");
        String cpuType = scan.next();
        System.out.println("Select RAM size:");
        int ram = scan.nextInt();
        System.out.println("Select storage type:");
        String storageType = scan.next();
        System.out.println("Select storage amount:");
        int storageAmount = scan.nextInt();
        System.out.println("Select resolution: ");
        String resolution = scan.next();


        int computerPrice = 0;
        if (screenSize ==13.3){
            computerPrice =computerPrice+200;
        }else if(screenSize==15.0){
            computerPrice = computerPrice+300;
        }else if (screenSize ==17.3){
            computerPrice = computerPrice + 400;

        }
        computerPrice=computerPrice;
        if (cpuType.equalsIgnoreCase("i3")){
            computerPrice =computerPrice + 150;
        }else if (cpuType.equalsIgnoreCase("i5")){
            computerPrice =computerPrice +250;
        }else if (cpuType.equalsIgnoreCase("i7")){
            computerPrice =computerPrice +350;
        }
        computerPrice = computerPrice;
        int ramPrice = 0;
        for (int i = 4; i <=ram; i+=4) {
            ramPrice = ramPrice +50;
        }
        computerPrice =computerPrice + ramPrice;

        int storagePrice =0;
        if (storageType.equalsIgnoreCase("HDD")){

            for (int j = 500; j <= storageAmount ; j+=500) {
                storagePrice = storagePrice + 50;
            }

        }else if(storageType.equalsIgnoreCase("SSD")){
            for (int k = 500; k <=storageAmount ; k+=500) {
                storagePrice = storagePrice + 100;
            }
        }
        computerPrice =computerPrice +storagePrice;
        if (resolution.equalsIgnoreCase("fullHD")){
            computerPrice =computerPrice +100;
        }else if (resolution.equalsIgnoreCase("4K")){
            computerPrice =computerPrice+200;
        }
        computerPrice =computerPrice;


        System.out.println("The computer price is: "+computerPrice);

        }

    }
