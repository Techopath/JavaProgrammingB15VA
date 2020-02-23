package day_40_custom_classes;

public class CarGurus {
    public static void main(String[] args) {
        Car acura = new Car();
        acura.model = "Acura ILX";
        acura.price = 20000.99;
        acura.color = "Black";
        acura.year = 2008;

        acura.displayInfoAboutCar();
        System.out.println();
        acura.drive();

        System.out.println("acura model: " + acura.model);
        acura.drive();
        acura.showPrice();
        ///another car object
        Car bmw = new Car();
        bmw.model = "BMW 5 series";
        bmw.color = "Black";
        bmw.price = 51115.0;
        bmw.year = 2019;
        bmw.drive();
        bmw.showPrice();

        //another car object
        Car porsche = new Car();
        porsche.setCarInfo("porsche 911", 130753, "Silver", 2020);
        porsche.drive();

        //another car object

        Car toyota = new Car();
        toyota.setCarInfo("Toyota Prius", 15500, "White",2019);
        toyota.drive();
        System.out.println();
        System.out.println("Model = "+toyota.model);
        System.out.println("Price = $"+toyota.price);
        System.out.println("Color = "+toyota.color);
        System.out.println("Year = "+toyota.year);

        //call getCarInfo for all car object we have
        acura.getCarInfo();
        toyota.getCarInfo();
        bmw.getCarInfo();
        porsche.getCarInfo();

        //compare prices for bmw and porsche and print out which is more expensive

        if(bmw.price>porsche.price){
            System.out.println("BMW is more expensive");
        }else{
            System.out.println("Porsche is more expensive");
        }

    }




    }
