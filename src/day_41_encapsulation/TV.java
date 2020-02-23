package day_41_encapsulation;
 /*
    instance variables/fields:
     - brand ----string
     - isOn -----boolean
     - channel -----int

     instance (object) methods/behaviour:
     - setTvInfo()
     - turnOn
       --> INFo: turning on LG tv ..
       if it is off, turn on
       if it is on,
     - turnOff
     - setChannel (new Channel)
     -toString
     ===========================================
     */
public class TV {
     String brand;
     String powerState; //"on" "off"
     int channel;

     public void setChannel(int newChannel){
         System.out.println("Info: Changing channel ....");
         channel = newChannel;

     }

     public void channelUp(){

         channel ++;
         System.out.println("Info: next channel ..." +channel);

     }
     public void channelDown(){

         channel --;
         System.out.println("Info: previous channel ..."+channel);
     }

     public void turnOn(){
         //if is off, then turn it On
         if(powerState.equals("off")){
             System.out.println("INFO: Turning ON " + brand +" TV");
             powerState = "on";
         }
     }
     public void turnOff(){
         //if it is ON, then Turn OFF
         if(powerState.equals("on")){
             System.out.println("INFO: Turning OFF " + brand +" TV");
             powerState = "off";
         }
     }
     public void setTVInfo(String pBrand, String pPowerState, int pChannel){
         System.out.println("INFO: setting TV information..");
         brand = pBrand;
         powerState = pPowerState;
         channel = pChannel;
     }
     @Override
     public String toString() {
         return "TV{" +
                 "brand='" + brand + '\'' +
                 ", powerState='" + powerState + '\'' +
                 ", channel=" + channel +
                 '}';
     }
 }














