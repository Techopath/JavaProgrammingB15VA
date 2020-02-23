package day_39_list_practice_custom_classes;

public class company {
    public static void main(String[] args) {
        // create object from Employee class.
        // new keyword
        String str = new String();
        Employee emp = new Employee();

        emp.name = "Ali";
        emp.age = 33;
        emp.jobTitle = "QA Engineer";
        emp.work();
    }
}
