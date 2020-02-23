package day_25_arrays_day4_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun java is amazing java is crazy";
        //find out how many words in the sentence and print it
        String [] words = sentence.split("java");
        System.out.println(words);
        System.out.println("number of words inside the array: "+words.length);

        //print everything in same line
        for(int i=0; i<words.length; i++){

            System.out.println(words[i]);
        }
        //print everything in reverse order in same line

        String reversed = "";

        for (int j = words.length-1; j >=0; j--) {
            System.out.println(words[j]+" ");
        reversed = reversed +words[j]+" ";
        }
        System.out.println("reversed: " + reversed.trim()); //.trim--> removes the unnecessary last space

        //
    }
}
