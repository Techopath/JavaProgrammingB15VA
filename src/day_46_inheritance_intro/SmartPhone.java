package day_46_inheritance_intro;

public class SmartPhone extends Phone{

    public int memorySize;

    public void useApp(String appName){

        System.out.println(appName +" is installed in " + brand+ " device");
    }
}
