package day_47_inheritance_intro_02;

public class EmployeesTest {
    public static void main(String[] args) {
        FullTimeEmployee ftEmployee = new FullTimeEmployee(); //when we create child class object, first of all parent class constructor runs.
        FullTimeEmployee emp = new FullTimeEmployee("Jamil","SDET",5);
        System.out.println(emp.getName());
        System.out.println(emp.getTitle());
        System.out.println(emp.getBonus());

        System.out.println(ftEmployee.getName());


    }
}
