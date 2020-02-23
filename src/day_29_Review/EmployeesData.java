package day_29_Review;

import java.util.Arrays;

public class EmployeesData {
    public static void main(String[] args) {
        String str = "Phil Salt [SDET] psalt@g.co ";
        //i want to extract job title.
        //find the index of "["
        int n1 =str.indexOf("["); //10
        int n2 = str.indexOf("]");//15

        String jobTitle = str.substring(n1+1,n2); //starts with n1 and includes it but doesn't include n2.
        //if we use str.substring(n1) only --it will extract all the rest of the string starting from n1
        System.out.println("Job Title: "+jobTitle);

        //rewrite the code above in a single statement

        System.out.println(str.substring(str.indexOf("[")+1, str.indexOf("]")));//

        //Task 2. extract first name and last name and assign into a variable
        //try with indexOf and substring
        //then try with split method

        int idx1 = str.indexOf(" ");
        int idx2 = str.indexOf("[")-1;
        int thirdSpace = str.indexOf(" ",str.indexOf(" ")+1);

        System.out.println(thirdSpace);


        String firstName = str.substring(0, idx1);
        String lastName = str.substring(idx1+1, idx2);
        System.out.println("first name is "+firstName +" and last name is "+lastName);
        //task3. Extract firstname and lastname using split method of String class

        String[] strArray = str.split(" ");
        System.out.println("Length: "+strArray.length);
        System.out.println(Arrays.toString(strArray));
        System.out.println("First Name: "+strArray[0] +"\nLast Name: "+strArray[1]);
        //other way of using split
        String firstName4 = str.split(" ")[0];
        System.out.println(firstName4);
        String lastName4 = str.split(" ")[1];
        System.out.println(lastName4);




//        int length = jobTitle.length();
//        System.out.println(length);
//
//        char third = jobTitle.charAt(2);
//        System.out.println(third);
//
//        for (char i = 0; i < length ; i++) {
//            if (jobTitle.charAt(i)>'G'){
//                System.out.println(jobTitle.charAt(i) +" is after letter G");
//            }else{
//                System.out.println(jobTitle.charAt(i)+" is before letter G");
//            }
//        }



    }

}
