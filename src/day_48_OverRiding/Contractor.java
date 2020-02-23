package day_48_OverRiding;

public class Contractor extends Employee {

    @Override
    public void calculatePay(int h, double r){ //the variable name doesn't matter. It works still.
        System.out.println("Employee pay: "+(h*r+200)+" $/week");
    }

    @Override
    public String toString(){
        return "Contractor toString() | "+super.toString();
    }


}
