package replitExamples;

import day_54_polymorphism.Diamond;
import day_54_polymorphism.Shape;
import day_54_polymorphism.Square;
import day_54_polymorphism.Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapesCollection {
    public static void main(String[] args) {
        //declare array that can store 2 squares

        Square[] squareArr = new Square[2];
        System.out.println(Arrays.toString(squareArr));
        squareArr[0] = new Square();
        squareArr[1] = new Square();

        squareArr[0].draw();
        squareArr[1].draw();

//----------------------------------------------------------
        Shape[] shapesArr = new Shape[4];
        shapesArr[3] = new Shape();
        shapesArr[0] = new Square();
        shapesArr[1] = new Triangle();
        shapesArr[2] = new Diamond();
        System.out.println(Arrays.toString(shapesArr));
//        shapesArr[0].draw();
//        shapesArr[1].draw();
//        shapesArr[2].draw();
//        shapesArr[3].draw();

        for (Shape eachShape:shapesArr) {
            eachShape.draw();
        }

        for (int i = 0; i < shapesArr.length; i++) {
            System.out.println();
            shapesArr[i].draw();
        }


        List<Shape> shapesList = new ArrayList<>();
        shapesList.add(new Shape());
        shapesList.add(new Triangle());
        shapesList.add(new Diamond());
        shapesList.add(new Square());

        for (Shape eachSh: shapesList) {
            eachSh.draw();
        }

        for (int i = 0; i < shapesList.size(); i++) {
            shapesList.get(i).draw();
        }

        System.out.println("---------ArrayList ------------");

        List<Triangle> triangleList = new ArrayList<>();
        triangleList.add(new Triangle());
        triangleList.add(new Triangle());
        triangleList.get(0).draw();
        triangleList.get(1).draw();


    }
}
