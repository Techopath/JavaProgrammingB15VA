package day_54_polymorphism;

public class Triangle extends Shape{

    public Triangle(){
        type = "Triangle";
    }

    @Override
    public void draw(){
        System.out.println(type);

        for (int i = 0; i < 5; i++) {
            for (int j = 5 - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("/ ");
            }
            System.out.println();
        }

    }


}
