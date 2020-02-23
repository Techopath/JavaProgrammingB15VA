package day_02_intro_to_variables;

public class VariablesIntro {
    public static void main(String[] args){
        int count; //declare variable
        count=123; //assign value 123 to count.
        System.out.println(count);
        System.out.println("The number assigned to count equals " +count );
        /* declare variable apples
        assign 5 to apples
        print value of apples
         */
        int apples;
        apples=5;
        System.out.println(apples);
        System.out.println("There are " +apples +" apples in the basket"); //we use + on either sides

        System.out.println();
        //combine variable declaration and assignment together.
        int students = 100;
        System.out.print(students);
        //
        int teachers = 58;
        System.out.println(teachers);
        System.out.println("teachers"); //not variable used
        //
        int people = 10000;
        System.out.println(people);
        people = 20000;
        System.out.println(people);
    }

}
