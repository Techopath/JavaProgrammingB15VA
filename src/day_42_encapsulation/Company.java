package day_42_encapsulation;

public class Company {
    public static void main(String[] args) {
        JobOffer comp1 = new JobOffer();
        comp1.setHourlyPay(100);
        System.out.println(comp1.getHourlyPay());
        System.out.println(comp1.toString());

        comp1.setLocation("Fairfax");
        System.out.println(comp1.getLocation());
        System.out.println(comp1.toString());

        //or
        System.out.println(comp1.getHourlyPay() +" | "+comp1.getLocation());
    }



}
