package day_38_methods_with_arrayList;

import java.util.*;

public class MethodsReturnArrayList {
    /*1.
    method: getMonth
    param: none
    return: List<String>
    returns list with all month names.
     */
    /*
    2.
    method:
    List<Integer>nums = getIntList(5)
    println(nums); => [1,2,3,4,5]
    if i enter 10 should print out until 10.

     */
    public static void main(String[] args) {

        ///call getMonths() and print out returned list.
        System.out.println(getMonth().toString());
        //how can i call getMonths() and assign returned list into another list then print it out.
        List<String>allMonths = getMonth();
        System.out.println("all months = "+allMonths);


        for (String each:allMonths ) {
            System.out.println("each = " + each);
        }
//2.
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        System.out.println(getIntList(size));
        //or

        System.out.println(getIntList(25));

        for (int i = 0; i < size; i++) {
            System.out.println(getIntList(i));
        }





    }
    //2.

    public static List<Integer> getIntList(int size){

        Random r = new Random(101);

        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= size; i++) {
            //nums.add(i);
            nums.add(r.nextInt(i));

        }
        return nums;


    }
    //1.
    public static List<String> getMonth (){
        List<String> months = new ArrayList<>();
        months.add("January");months.add("February");months.add("March"); months.add("April");months.add("May");
        months.add("June");months.add("July;");months.add("August");months.add("September");months.add("October");
        months.add("November");months.add("December");


        return months;
    }
}
