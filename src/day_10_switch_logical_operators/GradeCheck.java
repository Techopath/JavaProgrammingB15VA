package day_10_switch_logical_operators;

public class GradeCheck {
    public static void main(String [] args){
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good!");
                break;
            case 'C':
                System.out.println("Fair");
                break;
            case 'D':
                System.out.println("Failed!");
            default:
                System.out.println("Unknown grade!");
        }
    }
}
