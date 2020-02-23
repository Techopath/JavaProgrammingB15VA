package day_54_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class InstanceOf {

    public static void main(String[] args) {
        Shape diamond = new Diamond();
        System.out.println(diamond.getClass().getSimpleName()); //prints out the name of class.

        Shape shape =new Square();
        System.out.println("shape is referring to object of "+ shape.getClass().getSimpleName());

        if(shape.getClass().getSimpleName().equals("Square")){
            System.out.println("It is object of Square class");
        }

        //instance of operator

        if(shape instanceof Square){
            System.out.println("Square object");
        }else if(shape instanceof Diamond){
            System.out.println("Diamond object");
        }

        List<Shape> shapesList = new ArrayList<>();
        shapesList.add(new Shape());
        shapesList.add(new Triangle());
        shapesList.add(new Diamond());
        shapesList.add(new Square());

        shapesList.add(new Shape());
        shapesList.add(new Triangle());
        shapesList.add(new Diamond());
        shapesList.add(new Square());

        int shapeCount = 0, triangleCount =0, diamondCount = 0, squareCount = 0;
        shapeCount = triangleCount = diamondCount = squareCount = 0;

        for (Shape each:shapesList) {
            if(each instanceof Triangle){
                triangleCount++;
            }else if(each instanceof Diamond){
                diamondCount ++;
            }else if(each instanceof Square){
                squareCount ++;
            }else if(each instanceof Shape){

                shapeCount ++;
            }

        }

//        for (int i = 0; i < shapesList.size(); i++) {
//            if(shapesList instanceof Shape){
//                shapeCount ++;
//            }else if(shapesList instanceof Triangle){
//                triangleCount ++;
//            }else if(shapesList instanceof Diamond){
//                diamondCount ++;
//            }else if(shapesList instanceof Square){
//                squareCount ++;
//            }
//        }
        System.out.println("shapeCount = " + shapeCount);
        System.out.println("triangleCount = " + triangleCount);
        System.out.println("diamondCount = " + diamondCount);
        System.out.println("squareCount = " + squareCount);
    }
}
