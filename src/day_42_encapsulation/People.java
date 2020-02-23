package day_42_encapsulation;

public class People {
    public static void main(String[] args) {


        Person p1 = new Person();
       //p1.name = "abcd"; // Error: name is private
       // p1.age = -22; //Error: age is private.
        System.out.println(p1.toString());

        p1.setName("Vasyl");//vasyl goes to setName method in class named Person.
        System.out.println(p1.getName()); //getName returns name.
        System.out.println(p1.toString());
        p1.setAge(20);
        System.out.println(p1.getAge());
        System.out.println(p1.toString());

        ///--------create another object

        Person p2 = new Person();

        p2.setName("Sarah");
        System.out.println(p2.getName());
        System.out.println(p2.toString());
        p2.setAge(150);
        System.out.println(p2.getAge());
        System.out.println(p2.toString());

    }
}
