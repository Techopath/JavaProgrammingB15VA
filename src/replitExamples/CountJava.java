package replitExamples;

public class CountJava {
    public static void main(String[] args) {
        String word = "javaxjavagfdfgfhgjaavvava";
        int count = 0;
        for (int j = 0; j < word.length()-3; j++) {
            //   System.out.println(word.substring(j,j+4));
            if(word.substring(j,j+4).equals("java")){
                System.out.println(word.substring(j,j+4)+" found");
                count ++;
            }
        }
        System.out.println("count = " + count);

    }
}
