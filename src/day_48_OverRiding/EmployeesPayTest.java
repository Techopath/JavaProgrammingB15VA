package day_48_OverRiding;

public class EmployeesPayTest {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.calculatePay(40, 18);
        System.out.println(emp.toString()); //if we dont't type tostring method in parent class(Employee), the output will be hashcode
        System.out.println(emp); //the print out will be hashcode
        System.out.println(emp.toString());

        FullTimeEmployee ftemp =new FullTimeEmployee();
        ftemp.calculatePay(40, 25);
        System.out.println(ftemp.toString());

        Contractor cnt = new Contractor();
        cnt.calculatePay(40, 50);

        System.out.println(cnt.toString());
    }
}
