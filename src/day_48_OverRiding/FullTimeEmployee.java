package day_48_OverRiding;

public class FullTimeEmployee extends Employee {


    @Override
    public void calculatePay(int hour, double rate){
        System.out.println("Employee total pay: "+(hour*rate+5/100*(hour*rate))+" $/week");
    }

    @Override
    public String toString(){
        return "FullTime Employee toString()";
    }
}
