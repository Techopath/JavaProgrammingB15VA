package day_36_wrapper_arraylist;

public class ExtractNumbersFromString {
    public static void main(String[] args) {
        //declare string str

        String str = "java123is4%^5fu&n0";

        //print all numbers from str

        String strNumbers = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                strNumbers = strNumbers + str.charAt(i);

            }
        }

        System.out.println("strNumbers = " + strNumbers);

        // declare two string variable :
        // string letters = "";
        // String numbers = "";
        // store letters and numbers to above variables accordingly
        String letters ="";
        String symbols = "";

        for (char ch : str.toCharArray() ){
        if (Character.isDigit(ch)){
            symbols += ch;


        } else if (!Character.isLetterOrDigit(ch)){
            letters += ch;
            }
        }
        System.out.println("symbols = " + symbols);
        System.out.println("letters = " + letters);


//        String letters ="";
//        String numbers = "";
//
//        for (int n =0; n< str.length(); n++) {
//
//            char temp = str.charAt(n);
//
//            if(Character.isLetter(temp)){
//                letters += temp;
//
//            } else if (Character.isDigit(temp)){
//                numbers += temp;
//            }
//        }
//        System.out.println("\nstr = " + str);
//        System.out.println("numbers = " + numbers);
//        System.out.println("letters = " + letters);


//        String letters ="";
//        String numbers = "";
//
//        for (int i = 0; i < str.length(); i++) {
//             if (Character.isDigit(str.charAt(i))){
//                 numbers = numbers +str.charAt(i);
//             }else if (Character.isLetter(str.charAt(i))){
//                 letters =letters +str.charAt(i)+" ";
//             }else if (!Character.isLetterOrDigit(str.charAt(i))){
//                 System.out.println("Has symbol chars");
//             }
//        }
//        System.out.println("numbers = " + numbers);
//        System.out.println("letters = " + letters);


        //convert string to int
        int strToInt = Integer.parseInt(strNumbers);
        int multiply = strToInt*2;
        System.out.println("multiply = " + multiply);
        double add = Double.parseDouble(strNumbers);
        System.out.println("add = " + add);


// also possible but the code is longer
        String strNums = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1' || str.charAt(i) == '2' || str.charAt(i) == '3' || str.charAt(i) == '4' || str.charAt(i) == '5' || str.charAt(i) == '0'){
                strNums = strNums +str.charAt(i);
            }
        }
        System.out.println("strNums = " + strNums);


    }
}
