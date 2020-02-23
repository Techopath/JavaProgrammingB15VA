package day_19_for_loop2;

public class PrintLetters {
    public static void main(String[] args) {
        String name = "Muhammad";
        for (int i =0; i < name.length(); i++){

            System.out.print(i +" "+ name.charAt(i) +" ");
        }
        ///print your name in reverse
        System.out.println();
        for (int j = name.length()-1; j>=0; j--){
            System.out.print(name.charAt(j));

        }
    }
}
