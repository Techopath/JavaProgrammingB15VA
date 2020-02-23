package day_62_collections4;
import java.util.*;
public class HashMapPractice {
    public static void main(String[] args) {
        //declare raw hashMap - you can put different data types in it.
        //1.st way polymorphic way
        Map rawMap /*employees*/  = new HashMap();
        rawMap.put(1234,5678);
        rawMap.put(true, false);
        rawMap.put("key","value");
        rawMap.put("potatoes",7);

        System.out.println(rawMap);

        //declare polymorphic Map<Integer, String>

        Map<Integer, String> employees = new HashMap<>();

        //declare without polymorphism
        //      <numbers, list of strings>
        HashMap<Integer, List<String>> empMap = new HashMap<>();
        //
        List<Map<Integer, String>> list = new ArrayList<>();

        employees.put(10, "Ali");
        employees.put(20, "Nijat");
        employees.put(30, "yasin");
        employees.put(40,"Amir");
        employees.put(50,"Luba");
        employees.put(60, "May");
        employees.put(70, "Mars");
        employees.put(80, "Java");
        employees.put(80, "Fatiha");

        System.out.println("employees = " + employees.toString());

        //to print out one of the items
        System.out.println(80 +" - "+employees.get(80));

        System.out.println(20 +" - "+ employees.get(20));

        //100 is not in our collection Map

        System.out.println(employees.get(100));//null
        //Amir - out, replace him with Bin id 40.
        employees.replace(40, "Bin");
        System.out.println("employees = " + employees);
        //Bin - out, replace by Imtiaz id 40;
        employees.put(40, "Imtiaz");
        System.out.println("employees = " + employees);


        System.out.println(employees.containsKey(30));

        System.out.println("employees size() method - "+employees.size());
        System.out.println("---remove(key) ---"+employees.remove(10));
        System.out.println(employees.toString());

        System.out.println("---containsKey(key) ----method");
        System.out.println(employees.containsKey(70)); //true
        System.out.println(employees.containsKey(0));

        System.out.println(employees.containsValue("Nijat"));
        System.out.println(employees.containsValue("Nadir"));

        System.out.println("=-----isEmpty() ------method");
        System.out.println(employees.isEmpty());

        System.out.println(empMap.isEmpty());

        System.out.println("---keySet() method -----");
        System.out.println("keys: "+employees.keySet());
        Set<Integer> empIDs = employees.keySet();
        System.out.println("empIds = "+empIDs);

        System.out.println("----values() -----");
        System.out.println("values: "+employees.values());
        Collection<String> empNames = employees.values();
        System.out.println("empNames = " + empNames);








/*we can store different data types in ArrayList*/
//        ArrayList emp= new ArrayList();
//        emp.add("Muhammed");
//        emp.add(1);
//        System.out.println(emp);


    }

}
