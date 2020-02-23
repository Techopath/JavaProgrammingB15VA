package day_22_String_manipulation_arrays;

public class ArraysWithNumbers {
    public static void main(String[] args) {
        //declare numsArray with 5 numbers
        //assign value to each index
//1st way
        int[] numsArray = new int[5];
        numsArray[0]=123;
        numsArray[1]=345;
        numsArray[2]=33;
        numsArray[3]=10;
        numsArray[4]=numsArray[0]+numsArray[1];
        //declare and assign values in same statement
        //2nd way
        int [] numsArray2 = {44, 12, 14, 54, 78, 98, 100};
        System.out.println("numsArray2 = " + numsArray2[6]);

//3rd way , declare and assign values
        int[] numsArray3 = new int[] {0, 12, 45,74,1,0,1,2 };

        //declare 3 variables and assign values
        int n1 = 10;
        int n2 = 45;
        int n3 = 21;
        int [] numsArray4 = new int[]{n1, n2, n3};
        System.out.println(numsArray4[1]);

        //print size of each array
        //numsArray = 5
        System.out.println("array size : "+numsArray.length);
        System.out.println("array size : "+numsArray2.length);
        System.out.println("array size : "+numsArray3.length);
        System.out.println("array size : "+numsArray4.length);

        //declare variables and put them into an array

        //read from array
        for (int i = 0; i < numsArray2.length ; i++) {
            System.out.println(numsArray2[i]);//prints out the values in the array

        }

        System.out.println(numsArray2[0]);
        //print last one
        int k1 = numsArray.length;
        System.out.println(numsArray[4]);
        System.out.println("numsArray = " + numsArray[k1-1]);
        System.out.println();
        //print all numbers using for loop
        int count =0;
        for (int i = 0; i < numsArray.length ; i++) {
            System.out.print(numsArray[i] +", ");
            count ++;
        }
        System.out.println();
        System.out.println("there are " +count +" elements in the array");

        //print the number if it is more than 100
        for (int j = 0; j < numsArray.length; j++) {
            if (numsArray[j]>100){
                System.out.print("numbers bigger than 100 "+numsArray[j]+", ");
            }else {
                System.out.println("numbers smaller than 100 "+numsArray[j] +", ");
            }

        }
        System.out.println();
        //print array items in reverse in same line
        for (int k = numsArray.length-1; k >0 ; k--) {
            System.out.print(numsArray[k]+", ");
        }







    }
}
