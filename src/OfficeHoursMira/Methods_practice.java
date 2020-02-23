package OfficeHoursMira;

import org.w3c.dom.ls.LSOutput;

public class Methods_practice {

    public static void main(String[] args) {
        /*
            void methods - doesn't return any value but does some actions
            any data type can be an argument/parameter/input
            public static void methodName(Datatype name){
            }
                .charAt(int index) < method with parameter
            public static void methodName(){
            }
                   .toUpperCase() < method with no parameters
            Why do we need methods?
                -to avoid code redundancy (repeat same code in multiple places)
                -easier to maintain
                -code is more organized
           -Class behavior - each class can have different behaviors
                    which gonna belong to that class
         */

        int n1 = 5;//
        int n2 = 3;
        int n3 = 0;
        int n4 = 20;
        int n5 = -9;
        /*
        instead of writing if statement for each number we can write a method
        and call this method for every number.

         */
        evenOrOdd(n1);
        evenOrOdd(n2);
        evenOrOdd(n3);
        evenOrOdd(n4);
        evenOrOdd(n5);
        /*
        Write a method which prints an amount of times we see some char in some String
        Java (a) -> print 2
        apple (j) - > print 0
        1. create count  =0;
        2. loop through string and do count ++ when char in string equals to the given char.

         */
        charsCountInString("java", 'a');
        // another class
        splitLine();

        /*
            Write the method which takes an String array
           check if word in array starts with given char
            -if yes print the word
            -if not say "not the word we targeted"
            1. for loop
            2. if statement that check for given char in beginning
            3. print statements
         */
        splitLine();
        startsWithChar(new String[]{"Horse","House","Fruit"}, 'H');
        splitLine();
        String [] words = {"Apple", "Umbrella"};
        startsWithChar(words, 'H');


    }

    public static void evenOrOdd(int num){
        if (num % 2 == 0){
            System.out.println(num +" is even");

        }else{
            System.out.println(num + " is odd");
        }

        }
        public static void charsCountInString(String str, char ch){
        int count  = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ch){
                    count ++;

                }
            }
            System.out.println(str +" has letter \""+ch+"\" "+count+" times");
        }

        public static void splitLine(){
            System.out.println("===============||===============");
        }

        /*
        targetedChar
         */
        public static void startsWithChar(String [] str, char ch){
            for (int j = 0; j < str.length ; j++) {
                if (str[j].charAt(0) == ch){ //str[i].startsWith(ch+" ")
                    System.out.println("the word is " +str[j]);

                }else{
                    System.out.println("not the char we targeted");
                }
            }
        }
    }




