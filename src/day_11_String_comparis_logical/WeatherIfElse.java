package day_11_String_comparis_logical;

public class WeatherIfElse {
    public static void main(String [] args){
        String weather = "sunny";
        if (weather.equals("sunny")){
            System.out.println("go to park");
            System.out.println("Code Java");
        }else {
            System.out.println("Go to school");
            System.out.println("Code java");
        }
        String item = "Wooden Spoon";
        if (item.equals("Wooden spoon")){
            System.out.println("15,937 wooden spoons for sale");
        }else {
            System.out.println("no wooden spoons");
        }
        if (item.equalsIgnoreCase("WOODEN spoon")){
            System.out.println("");
        }

    }
}
