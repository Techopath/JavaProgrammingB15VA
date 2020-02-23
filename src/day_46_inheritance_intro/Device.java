package day_46_inheritance_intro;

//Device is a parent class
public class Device {
    public String brand;
    public double price;
    public String country;

    public void use(){

        System.out.println("using "+brand +" that costs "+price +" and made in "+country);
        System.out.println("\""+brand +"\" is a device used everywhere in the world");

    }
}
