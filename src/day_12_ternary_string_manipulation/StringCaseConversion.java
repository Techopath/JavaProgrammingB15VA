package day_12_ternary_string_manipulation;

public class StringCaseConversion {
    public static void main(String [] args ){
        String city = "New York";
        System.out.println(city);

        System.out.println(city.toUpperCase());//converts to upper case letters
        System.out.println(city.toLowerCase());//converts to lower case letters
        System.out.println(city);//prints out initial city data New York
        String lan ="Java";
        lan = lan.toUpperCase(); //assigns upper case letters to variable lan. updates the lan variable
        System.out.println(lan);
        lan = lan.toLowerCase();
        System.out.println(lan);
    }

}
