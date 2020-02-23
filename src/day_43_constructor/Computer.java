package day_43_constructor;

public class Computer {
    private String brand;
    private String os;
    private double price;
    private int size;
    //constructor is same as class name
    public Computer(){
        System.out.println("Computer no-args constructor");
        brand = "unknownbrand";
        os = "unknowos";

    }

    public Computer (String brand, String os, double price, int size){ /*if we create constructor that lets us to set data types
    then we will not need to create setter bellow*/
        System.out.println("Computer 3 args constructor");
        this.brand = brand;
        this.os = os;
        this.price = price;
        this.size = size;

    }

    public String getBrand(){
        return brand;
    }
//    public void setBrand(String brand){
//        this.brand = brand;
//    }

    public String getOs(){
        return os;
    }
//    public void setOs(String os){
//        this.os = os;
//    }

    public double getPrice(){
        return price;
    }
//    public void setPrice(){
//        this.price =price;
//    }
    public int getSize(){
        return size;
    }
//    public void setSize(){
//        this.size = size;
//    }



    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", os='" + os + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }


    public void setPrice(double price) {
        this.price = price;
    }
}
