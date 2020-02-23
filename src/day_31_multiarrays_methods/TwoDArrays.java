package day_31_multiarrays_methods;

import java.util.Arrays;

public class TwoDArrays {
    public static void main(String[] args) {
        String [][] list = new String [4][3];
        //add vegetables
        list [0][0] = "potatoes";
        list [0][1] = "carrots";
        list [0][2] = "onion";
        //add fruits
        list [1][0] = "apples";
        list [1][1] = "kiwis";
        list [1][2] = "Figs";
        //add dairy
        list [2][0] = "milk";
        list [2][1] = "Eggs";
        list [2][2] = "cheese";
        //add bakery
        list [3][0] = "bread";
        list [3][1] = "bagel";
        list [3][2] = "muffins";

        System.out.println(Arrays.deepToString(list));

        String fruit = list[1][1];
        System.out.println("my favourite fruit: "+fruit);
        //lets find out how many arrays in the 20 array
        System.out.println("number of arrays(lines): "+ list.length);
        //how many vegetables
        System.out.println("number of vegetables: "+list[0].length);
        System.out.println("number of fruits: "+list[1].length);
        System.out.println("number of dairy: "+list[2].length);
        System.out.println("number of bakery: "+list[3].length);
       // System.out.println(list[3][1]);

        //how to print using a loop
        //print all vegetables using a loop
        System.out.println();
        System.out.println("vegetable items: ");
        int countV = 0;
        for (int i = 0; i < list[0].length; i++) {

            System.out.println(list[0][i]);
            countV ++;

        }
        System.out.println(countV);
        System.out.println();
        System.out.println("bakery items: ");
        //print all bakery items
int countB=0;
        for (int i = 0; i < list[3].length; i++) {

            System.out.println(list[3][i]);
            countB ++;

        }
        System.out.println(countB);

        //use for each loop to print all dairy
        System.out.println();
        System.out.println("dairy: ");

        for (String dairy:list[2]){

                System.out.println(dairy);


        }

        //use nested loop to print all items in the list
        System.out.println();
        System.out.println("all items: ");
        int countAll = 0;
        for (int i = 0; i < list.length ; i++) {
            System.out.println();
            for (int j = 0; j <list[i].length ; j++) {
                System.out.println("Row: "+(i+1)+" Col: "+(j+1));
                System.out.println("["+i+"]"+"["+j+"] => "+list[i][j]);
                countAll ++;

            }
        }
        System.out.println("items count: "+countAll);


    }
}
