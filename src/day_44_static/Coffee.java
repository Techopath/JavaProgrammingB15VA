package day_44_static;

/*
- class: Coffee
 data fields:
-  String name;
-  String size;(tall, grande, venti)
- double price;

encapsulate, toString();

2 constructors
- no args
- 3 args

---> drinking(); "Drinking grande Latte that i bought for "

*/

import OfficeHoursMira.Office;

public class Coffee {

    private String name;
    private String size;
    private double price;


//constructor with args
    public Coffee (String name, String size, double price){
        this.name = name;

//        if(size.equalsIgnoreCase("tall") || size.equalsIgnoreCase("grande") || size.equalsIgnoreCase("venti")){
//            this.size = size;
//
//        }
        this.setSize(size);//calls set from below defined
        this.price = price;
    }
    public Coffee (){
        this.name = "undecided";
        this.size = "not sure";
        this.price = 0.0;

    }

    public void drink(){

        System.out.println("Drinking " + size + " " + name + " for $" + price);
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSize() {
        return size;
    }
    //tall, grande, venti
    public void setSize(String size) {
        if(size.equals("tall") | size.equals("grande") | size.equals("venti")) {
            this.size = size;
        }else{
            System.out.println("ERROR: Invalid size - " + size);
            this.size = "unknown";
        }
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

}
