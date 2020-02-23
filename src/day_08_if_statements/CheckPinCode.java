package day_08_if_statements;

public class CheckPinCode {
    public static void main(String [] args){
        System.out.println("Welcome to Well Fargo ATM");
        int secretPinCode = 2345;
        int inputCode = 2345;
        if (inputCode == secretPinCode) {
            System.out.println("Welcome to Your Account Muhammad");
        }else {
            System.out.println("Invalid Pin code! \n Access denied!");
        }
    }


}
