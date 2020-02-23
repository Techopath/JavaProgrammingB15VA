package day_54_polymorphism;

public class Diamond extends Shape {

public Diamond(){
    type ="Diamond";
}

    @Override
    public void draw(){
        System.out.println(type);
//        for(int i = 5; i > -5; i--)
//        {
//            for(int j = 0; j < i; j++)
//            {
//                System.out.print(" ");
//            }
//            for(int j = 0; j >= i; j--)
//            {
//                System.out.print(" ");
//            }
//            System.out.println("/");
//        }
        for (int i = 0; i < 5; i++) {
            for (int j = 5 - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 4; i > 0; i--) {
            for (int j = 1; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
