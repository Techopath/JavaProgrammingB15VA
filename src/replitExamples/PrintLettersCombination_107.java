package replitExamples;

public class PrintLettersCombination_107 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        int count =0;
        for (char i = 'z'; i >='v'; i--) {
            for (char j ='z'; j>='v';j--) {

                    System.out.println(i + "" + j);
                    count++;

            }
        }
        System.out.println("possible combination number "+count);
    }
}
