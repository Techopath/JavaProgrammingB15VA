package day_14_string_manipulation;

public class EtsyTitle {
    public static void main(String[] args) {
        String title = "Wooden spoon | Etsy"; //if w is lower case it gives error
        if (title.startsWith("Wooden spoon")
                && title.contains("|")
                && title.endsWith("Etsy")){
            System.out.println("Test passed. Etsy title is correct");

        }
    }
}
