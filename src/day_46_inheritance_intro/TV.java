package day_46_inheritance_intro;

//tv is - a device dependant
public class TV extends Device {
        public int screenSize;
        public boolean isSmart;
        public void watch(){
            System.out.println("watching "+ brand + " TV with screen size "+screenSize + " is a smart device? "+isSmart);
        }


}
