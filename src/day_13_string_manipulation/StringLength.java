package day_13_string_manipulation;

public class StringLength {
    public static void main(String[] args) {
        String school = "Cybertek School";
        //print number of characters
        System.out.println(school.length());
        int count =school.length();
        System.out.println(school +" is " + count + " characters");

        String firstName = "Murodil";
        String lastName = "Ruzimatov";
        String fullName = firstName + " " +lastName;
        //System.out.println(fullName);
        int nofirstName = firstName.length();
        int nolastName = lastName.length();
        System.out.println("Full name is: " +fullName +"\nfirst name has " +nofirstName +" of characters and last name has " +nolastName +" characters" +
                "\n the full name has " + (fullName.length()-1) +" characters excluding space bar");
        System.out.println("-----------------------");

        String password = "cybertek12312121212121212121";
        //check if the password is more than or equal to 8 characters.
        //if yes, "password length matches requirement"
        //if not "password is too short , needs to be minimum of 8 characters"
        int length = password.length();
        System.out.println("the password has "+length +" characters");
        if (password.length()>= 8 && password.length() <= 16) {
            System.out.println("password meets requirement");
        }else if (length <8 ) {
            System.out.println(" password is too short, it must be minimum 8 characters");
        }else if (length >16){
            System.out.println("password is too long. it must be at most 16 characters");
        }
    }
}
