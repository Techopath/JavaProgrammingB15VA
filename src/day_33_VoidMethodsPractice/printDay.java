package day_33_VoidMethodsPractice;

/*
int day
day => 1 => Monday
day => 2 => tuesday
day => 3 => wednesday
day => 4 => thursay
....
....
 */
public class printDay {
    public static void main(String[] args) {
        //call the method name here
        //printDay
        printDay(1);
        printDay(2);
        printDay(3);
        printDay(4);
        printDay(5);
        printDay(6);
        printDay(7);
        printDay(8);


      /*
      Method name: buildEmail
      Input/Params/Args: String name, String company
      - remove spaces from name and company
      - String email -> name@company.com
      -> print emial

       */
        buildEmail(" MuhamMad Mahmudov", " Cybertek ");

      /*
      name: checkEligible
      input:
       */
//      checkEligible(500);
        int[] scores = {700, 570, 800};
//      checkEligible(scores[0]);
//      checkEligible(scores[1]);
//      checkEligible(scores[2]);

        //try with a loop
        for (int i = 0; i < scores.length; i++) {
            checkEligible(scores[i]);
        }



    }

    ///-------------------------------------------------------------------------

    public static void printDay(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Every other day");


        }
    }

    ////////////------------------------------------------------------------------------
    public static void buildEmail(String str1, String str2) {

        //or simply using the following replace method.

        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");
        System.out.println(str1.toLowerCase() + "@" + str2.toLowerCase() + ".com");
    }


    //////------------------------------------------------------------
    public static void checkEligible(int creditScore) {
        if (creditScore >= 640) {
            System.out.println("Congratulations, you are eligible for this loan");
        } else {
            System.out.println("Sorry, you are not eligible for this loan");
        }
    }

    //----------------------------------


}
