package day_11_String_comparis_logical;

public class CreditScore {
    public static void main(String[] args) {
        int score = 749;
        if (score >= 750 && score <=850 ){
            System.out.println("Excellent");
        }else if (score >= 700 && score <=749){
            System.out.println("Good");

        }else if (score >=650 && score <=699){
            System.out.println("Fair");
        }else if (score >=550 && score <=649){
            System.out.println("Poor");
        }else if (score <550){
            System.out.println("bad");
        }else {
            System.out.println("The value is not in the range of 0-850");
        }
    }
}
