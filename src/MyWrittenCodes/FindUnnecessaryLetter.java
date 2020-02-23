package MyWrittenCodes;

public class FindUnnecessaryLetter {
    public static void main(String[] args) {

        String name = "Muhammaddd";
        String newName = "";
        System.out.print("Your name is: ");
        for (int j=0; j<name.length()-1;j++){
            if (name.charAt(j) != name.charAt(j+1) ){
                newName = newName +name.charAt(j)+"";


               // System.out.println(newName);

            }


        }
        System.out.print(newName);
        System.out.println();


     }

}

