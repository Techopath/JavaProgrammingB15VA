package day_09_multibranch_switch;

public class Citizens_if_statement {
    public static void main(String [] args) {
        String citizenType = "" ; //empty string
        int age = 37;
        if (age >= 65) {
            citizenType = "Senior";
        } else {
            citizenType = "Non-senior";
        }
        System.out.println("Citizen Type is " + citizenType);
    }
}
