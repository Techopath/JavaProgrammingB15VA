package day_48_OverRiding;

public class Employee {
    //@Override //cannot be applied here. it works only in sub classes that can override from parent class.
    public void calculatePay(int hour, double rate){
        System.out.println("Employee pay: "+(hour*rate)+" $/week");
    }

    @Override
    public String toString(){
        return "Employee toString()";
    }

}
