package day_25_arrays_day4_split;

public class SplitMethod {
    public static void main(String[] args) {

        String words = "java, ruby, c++, python, javascript, selenium, QA ";
        //split the words by "," and assign to String []
        String [] wordsArray = words.split(", ");

        int wl = wordsArray.length;
        System.out.println(wl);
        System.out.println(wordsArray[1]);

        for (String n:wordsArray){
            System.out.print(n +" ");

        }
        System.out.println();
        for (int i = 0; i < wl; i++) {
            System.out.print(wordsArray[i]+" ");

        }

        //
        String results = "About 117,000,000 results (1.33 seconds)";
        String [] googleArray = results.split(" ");
        System.out.println(googleArray[1]);

        for (String j:googleArray){
            System.out.println(j);
        }
    }
}
