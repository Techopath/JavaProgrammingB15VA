package day_18_forLoop;

public class PrintEvenOddNumbers {
    public static void main(String[] args) {
        int num = 100;
        System.out.print("even numbers:");
        for (int i=0;i<=100; i++){
        if (i %2 ==0){
            System.out.print(i +" ");
       }
//        else{
//
//         System.out.print(+i);
//  }

        }
        System.out.println();
        System.out.print("odd numbers:");

        for (int i =0; i <=100; i++){
            if (i%2 !=0){

                System.out.print(i +" ");

            }

        }
        System.out.println("we want these numbers: ");
        for (int i =1;i<100; i++ ){
            if (i%2 !=0 && i >50 && i<60){
                System.out.print(i +" ");
            }
        }


    }

}
