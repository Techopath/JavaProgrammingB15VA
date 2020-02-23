package day_20;

public class Neighbors {
    public static void main(String[] args) {
        String str = "jaavva iis fuun";
        for (int i =0; i<str.length()-1; i++){
            //System.out.println(str.charAt(i)+""+str.charAt(i+1) +"beep");
            /*
            i =0
            i +1 -> 1
            ja
            i -> 1
            i+1 -> 2
            aa
             i -> 2
             i+1 -> 3
             av

             */
           if (str.charAt(i) == str.charAt(i+1)){
               System.out.println("beep - "+str.charAt(i));

           }

        }
    }
}
