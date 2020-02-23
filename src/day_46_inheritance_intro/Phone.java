package day_46_inheritance_intro;

//phone is -a device dependant, child class
public class Phone extends Device {

    public String carrier;
    public void call() {
        System.out.println("Calling from " + brand + " phone using " + carrier);
    }
    public  void text(String message){

        System.out.println("the message is "+message+" and I am texting from " + brand + " phone using " + carrier);
    }


}
