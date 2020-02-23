package day_11_String_comparis_logical;

public class LoginTest {
    public static void main(String[] args) {
        String userName = "cbtuser";
        String password = "abc123";
        if (userName.equalsIgnoreCase("cbtuser") && password.equals("abc123")){
            System.out.println("Login successful, welcome!");

        }else if (userName.equalsIgnoreCase("cbtuser") && !password.equals("abc123")){
            System.out.println("Invalid password. Try again!");
        }else if (!userName.equals("cbtuser") && !password.equals("abc123")){
            System.out.println("Invalid username and password. ");
        }
    }
}
