package day_23_array_day2;
/*//there are multiple temas each has score between  0-100;
//create an array that can store scores of 5 teams.
//import scanner, create scanner object.
//int [] scores is array name.
//"enter 1 team score"
// 23
// assign 23 to index 0 ....scores[] = score;
//"enter 2 team score"
// 55
// assign 55 to index 1
//"enter 3 team score"
// 99
// assign 99 to index 2
*/
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.Scanner;
public class ArrayWithScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 teams scores:");
        int [] scores = new int [5];
      //  System.out.println(scores[0]);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter team "+(i+1)+" score : ");
//            int score = scan.nextInt();
//            scores[i]= score;
            scores[i] = scan.nextInt();


        }
        //print all scores in a line
        for(int score : scores){
            System.out.print(score + " ");
        }
        System.out.println();
        for (int j = 0; j <scores.length ; j++) {
            if (scores[j] >100 || scores[j]<0){
                System.out.println("invalid score. Try numbers between 0-100");
            }
            else if (scores[j] <= 50){
                System.out.println("team "+(j+1)+" with score " +scores[j] +" is looser. ");
            }else{
                System.out.println("team "+(j+1)+" with score " +scores[j] +" is winner. ");
            }

            //find the max score
            int max =0;
            for (int k = 0; k < scores.length; k++) {
                System.out.println(scores[k]);
                if (scores[k]>max){
                    max = scores[k];

                }else{
                    System.out.println("all scores are equal");
                }




            }
            System.out.println("max is : "+max);

            //print out the sum of all scores

            int sum = 0;
            for (int l = 0; l < scores.length; l++) {
                sum = sum +scores[l];




            }
            System.out.println("sum is "+sum);
            System.out.println();
            int min =scores[1];
            for (int k = 0; k < scores.length; k++) {
                System.out.println(scores[k]);
                if (scores[k] < scores[1]) {
                    min = scores[k];

                } else {
                    System.out.println("all scores are equal");
                }


            }
            System.out.println("min is "+min);
            System.out.println();

            //find min score with for each
            int Min = scores[0];
            for (int num :scores){
                if (num<Min){
                    Min =num;

                }
            }
            System.out.println(Min +" is the minimum score among the teams");


        }

        //find average score
        int averageScore =0;
        int firstAdd = 0;
        for (int m =0; m<scores.length; m++){
            firstAdd = firstAdd+ scores[m];
            averageScore = firstAdd / scores.length;
        }
        System.out.println("Average score is "+averageScore);



    }
}
