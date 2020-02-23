package day_08_if_statements;

public class BonusCalculator {
    public static void main(String [] args) {
        double salary = 1000.0;
        double sales = 10000.4;
        int bonus = 0;
        if (sales >= 10000.0) {
            bonus = bonus +500; //or bonus +=500;
            salary = salary + bonus; //or salary += bonus;

        }else {
            bonus = bonus + 50;
            salary = salary +bonus;
        }
        System.out.println("Salary: " + salary + "\nbonus: " + bonus);
    }
}
