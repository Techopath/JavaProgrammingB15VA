package day_14_string_manipulation;

public class EmailDomain {
    public static void main(String[] args) {
        String email = "employee@gmail.com";
        if (email.contains("@gmail")){
            System.out.println("Google account");

        }else if (email.contains("hotmail")){
            System.out.println("Hotmail account");
        }else {
            System.out.println("some other account");
        }
    }
}
