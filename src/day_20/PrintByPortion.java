package day_20;
//write a for loop to iterate until
public class PrintByPortion {
    public static void main(String[] args) {
        String str = "my cat, your dog";
        for (int n=0; n<str.length()-3; n++){
            //System.out.println(str.charAt(n) +""+str.charAt(n+1)+""+str.charAt(n+2));//long way
            //System.out.println(str.substring(n,n+3)); //doesnt include the last character therefore we write n+3.
            if (str.substring(n, n+4).equals("your")){
                System.out.println("your found");
            }
        }











    }
}
