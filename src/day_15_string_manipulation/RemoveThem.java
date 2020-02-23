package day_15_string_manipulation;

public class RemoveThem {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        //System.out.println(sentence.replace("Java is fun", "Javaisfun"));//long way
        System.out.println(sentence.replace(" ", ""));
        //remove is
        System.out.println(sentence.replace(" is", ""));

        String etsyResults = "iphone case (212, 713 Results)";
        etsyResults = etsyResults.replace("iphone case (" , "");
        etsyResults = etsyResults.replace(", ", "");
        etsyResults = etsyResults.replace(" Results)", "");
        System.out.println(etsyResults);

        ///
        String mixed = "!@J#$A%^VA*(";
        mixed = mixed.replace("!@", "")
                     .replace("#$", "")
                     .replace("%^", "")
                     .replace("*(", "");
        System.out.println(mixed);

    }
}
