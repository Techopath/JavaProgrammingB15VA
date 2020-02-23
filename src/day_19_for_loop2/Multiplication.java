package day_19_for_loop2;

public class Multiplication {
    public static void main(String[] args) {
        int number =3;
        if (number <1 || number >10){
            System.out.println("Error. Invalid number");
            //return;//stop here. end main method
            System.exit(0);//stop here. more powerful version
        }
        System.out.println("Multiplication table for " +number);

        for (int n=1;n<=10;n++){
            int result = n*number;
            System.out.println(n +" * "+number+" = " + result);

        }
        for (int i =1; i <=10; i ++){
            for (int j=1; j<=10; j++){
                int ij = i*j;
                System.out.println(i +" * " + j + " = " + ij +"  ");
            }
        }
    }
}
