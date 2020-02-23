package day_63_last_day;

import java.util.List;
import java.util.*;

public class ListOfMaps {
    public static void main(String[] args) {

        //declare List of Map<String, String>

        List<Map<String, String>> employees = new ArrayList<>();
        Map<String,String> emp1Data = new HashMap<>();

        emp1Data.put("EmpID", "123");
        emp1Data.put("EmpName", "John Doe");
        emp1Data.put("Job Title", "SDET");
        emp1Data.put("Salary", "103000");
        //emp1Data.put("EmpID", "124"); // Incorrect, if we want to put id for another employee than we will need to create another Map for that employee.

        System.out.println(emp1Data.toString());

        Map<String, String> emp2Data = new HashMap<>();
        emp2Data.put("EmpID", "124");
        emp2Data.put("EmpName", "Ahmet Toran");
        emp2Data.put("Job Title", "Developer");
        emp2Data.put("Salary", "250000");

        System.out.println(emp2Data.toString());

        employees.add(emp1Data); //
        employees.add(emp2Data);
        System.out.println(employees.toString());
        System.out.println("Employee size: "+employees.size());



        System.out.println(employees.get(0).get("EmpName")); //prints out the employee name in 0 index
        System.out.println(employees.get(1).get("EmpName")); //prints out the employee name in 1 index

        System.out.println(employees.get(0)); //prints out the whole information about the employee in 0 index but not with order
        System.out.println(employees.get(1));

        //Using for each loop. print job title for each employee
       int totalSalary = 0;
        for (Map <String, String> empMap: employees) {
            System.out.println(empMap.get("Job Title"));
            totalSalary += Integer.parseInt(empMap.get("Salary"));

        }

        System.out.println("totalSalary = " + totalSalary);
    }
}
