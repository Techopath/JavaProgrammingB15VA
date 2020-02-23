package day_46_inheritance_intro;

public class devicesType {
    public static void main(String[] args) {

        System.out.println("Device class -parent class---------");
        Device charger = new Device();
        charger.brand = "android charger usb";
        charger.price = 12.90;
        charger.country = "Thailand";
        charger.use();

        System.out.println("-----------------TV class-------child class-----------");
        TV samsung = new TV();
        samsung.brand = "Samsung";
        samsung.screenSize = 80;
        samsung.isSmart = true;
        samsung.use();
        samsung.watch();

        System.out.println("-----------child class ------Phone----------");

        Phone mia2Light = new Phone();
        mia2Light.brand = "Mi A2 Light";
        mia2Light.price = 100;
        mia2Light.country = "China";
        mia2Light.carrier = "T-Mobile";
        mia2Light.use();
        mia2Light.call();
        mia2Light.text("java is fun!");

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.brand = "Samsung Galaxy Note 10"; //Device
        smartPhone.price = 899.0; //Device
        smartPhone.country = "South Korea"; //Device
        smartPhone.carrier = "Verizon"; //Phone
        smartPhone.memorySize = 128; // SmartPhone
        smartPhone.use(); //Device
        smartPhone.call(); //Phone
        smartPhone.text("Hello there"); // Phone
        smartPhone.useApp("Slack"); // SmartPhone


    }
}
