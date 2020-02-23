package day_47_inheritance_intro_02;

public class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String name, String title, double bonus) {
        super(name, title);
        this.bonus = bonus;

    }

    public FullTimeEmployee(){
        super();//runs parent class constructor
        System.out.println("FullTimeEmployee no-args Constructor");

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
