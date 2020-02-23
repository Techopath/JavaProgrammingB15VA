package day_54_polymorphism;

public class ShapeTypesMain {
    public static void main(String[] args) {

//        Shape shape = new Shape();
//        shape.draw();
//        Square sq = new Square();
//        sq.draw();
//        Triangle tri = new Triangle();
//        tri.draw();
//        Diamond dia = new Diamond();
//        dia.draw();

        //POLYMORPHISM

//        Shape triangle = new Triangle();
//        triangle.draw();
//
//        Shape diamond = new Diamond();
//        diamond.draw();
//
//        Shape square = new Square();
//        square.draw();

        Shape shape1 = new Square();
        shape1.draw();

        shape1 = new Triangle();
        shape1.draw();

        //we can create new objects in this case shapes using the same object name if we use polymorphism.
        // this is benefit of polymorphism.

        shape1 = new Diamond();
        shape1.draw();

        System.out.println("--------Call draw() without variable, using new keyword------------");
        new Triangle().draw();
        new Diamond().draw();
        new Square().draw();

        System.out.println("java".toUpperCase());

        System.out.println("--create 4 shapes using polymorphism ....");

        Object shapeObject = new Triangle();
        //shapeObject.draw(); //shape class doesnt have draw method

        Shape square1 = new Square();
        Shape triangle1 = new Triangle();
        Shape diamond1 = new Diamond();

        square1.draw();
        triangle1.draw();
        diamond1.draw();

        //square1.squareMethod();










    }
}
