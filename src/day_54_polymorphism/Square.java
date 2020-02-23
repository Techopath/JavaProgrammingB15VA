package day_54_polymorphism;

public class Square extends Shape {

    public Square(){
        super(); //optional because the compiler automatically calls the constructor and assigns "Square " to type.
        type ="square";
    }

    public void draw(){
        System.out.println(type);

        for (int i=0; i<6; i++){
            for (int j=0; j<6; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
