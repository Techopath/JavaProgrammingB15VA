package day_40_custom_classes;

public class etsyShop {
    public static void main(String[] args) {

        /*
        in this main method we take the advantage of Product class from another source which we declared already.
         */
        Product prodObj1 = new Product();
        //assign values to prodObj1
        prodObj1.title = "wooden spoon";
        prodObj1.price = 14.99;
        prodObj1.rating = 5;
        prodObj1.seller = "Memento";
        //add new object
        Product prodObj2 = new Product();
        //assign values to prodObj2
        prodObj2.title = "plastic spoon";
        prodObj2.price = 5.0;
        prodObj2.rating = 4;
        prodObj2.seller = "Memento";
        prodObj2.bestSeller = true; //we cannot add it unless we add it in the main source template class.
        prodObj2.freeShipping = false; //gives Error;when  we didnt declare it in main source in Product class.

        //print values from prodObj1
        System.out.println("----------prodObj1----------------");
        System.out.println("prodObj1 title = " + prodObj1.title);
        System.out.println("prodObj1 price = " + prodObj1.price);
        System.out.println("prodObj1 rating = " + prodObj1.rating);
        System.out.println("prodObj1 seller = " + prodObj1.seller);
        System.out.println("prodObj1 bestSeller = " + prodObj1.bestSeller);
        System.out.println("prodObj1 freeShipping = " + prodObj1.freeShipping);

        //
        System.out.println("-------------prodObj2-----------------");
        System.out.println("prodObj2 title = " + prodObj2.title);
        System.out.println("prodObj2 price = " + prodObj2.price);
        System.out.println("prodObj2 rating = " + prodObj2.rating);
        System.out.println("prodObj2 seller = " + prodObj2.seller);
        System.out.println("prodObj2 bestSeller = " + prodObj2.bestSeller);
        System.out.println("prodObj2 freeShipping = " + prodObj2.freeShipping);

        //call the method of Product class
        //objName.methodName();
        prodObj1.displayInfo();
        prodObj2.displayInfo();

    }
}
