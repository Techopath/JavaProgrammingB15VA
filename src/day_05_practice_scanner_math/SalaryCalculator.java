package day_05_practice_scanner_math;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your hourly rate? ");
        double hourlyRate = input.nextDouble();
        double weeklySalary = hourlyRate*40;
        double monthlySalary = weeklySalary*52/12;
        double annualSalary = monthlySalary*12;
        System.out.println("Your weekly salary is " +weeklySalary +"\n Your monthly salary is " +monthlySalary +
        "\n Your annual salary is " +annualSalary);

    }
}
