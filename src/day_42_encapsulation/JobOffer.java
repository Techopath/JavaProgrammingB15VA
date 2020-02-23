package day_42_encapsulation;

public class JobOffer {
    //encapsulate the following instance variables
    private int hourlyPay;
    //boolean isFullTime;
    private String location;

    //todo
    // "this. keyword refers to instance variable in java. "

    public void setHourlyPay(int hourlyPay){
        this.hourlyPay =hourlyPay;

    }

    public int getHourlyPay(){
        return hourlyPay;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getLocation(){
        return location;
    }

    @Override
    public String toString() {
        return "JobOffer{" +
                "hourlyPay=" + hourlyPay +
                ", location='" + location + '\'' +
                '}';
    }
}
