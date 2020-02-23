package day_40_custom_classes;

public class Car {
    //model, price, color, year.
    String model;
    double price;
    String color;
    int year;


    public void setCarInfo(String newModel, double newPrice, String newColor, int newYear){
        //assign param variables to object variables

        model = newModel;
        price = newPrice;
        color = newColor;
        year = newYear;

    }
    public void getCarInfo(){
        System.out.println("Car: "+model+ ", " +price+ ", "+color+ ", "+year);
    }



    public void displayInfoAboutCar(){
    System.out.println("Model = "+model);
    System.out.println("Price = "+price);
    System.out.println("Color = "+color);
    System.out.println("Year = "+year);

}


public void drive(){
    System.out.println(model + " is driving ... ");
}

public void showPrice(){
    System.out.println(model+" price is "+price);
}
}
