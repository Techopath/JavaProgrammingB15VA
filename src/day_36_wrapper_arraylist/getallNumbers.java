package day_36_wrapper_arraylist;

public class getallNumbers {
    public static void main(String[] args) {

        String s = "cybertek2020classb15";

        System.out.println(getOnlyNumbers(s));
        System.out.println(getOnlyNumbers("java100%isfun+1"));
        System.out.println(getOnlyNumbers("hi"));

        System.out.println(getAllNumbers("cybertek%"));

    }
    public static Integer getOnlyNumbers(String str){
        String numbers ="";
        for (int i = 0; i < str.length(); i++) {


            if (Character.isDigit(str.charAt(i))){
                numbers += str.charAt(i);

            }

        }
        if (numbers.isEmpty()){
            return 0;
        }
        int nums = Integer.parseInt(numbers);//this turns out int (primitive).
        //return nums;
        Integer n = Integer.valueOf(numbers); //this turns out wrapper object.
        return n;





    }

    public static Integer getAllNumbers(String strNum){
        if(strNum.replaceAll("[^0-9]","").isEmpty()) return 0;
        return Integer.parseInt(strNum.replaceAll("[^0-9]",""));
    }
}
