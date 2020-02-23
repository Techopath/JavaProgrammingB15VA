package day_43_constructor;

public class CATConstructor {
    public static void main(String [] args) {
        Cat luna = new Cat();

        Cat mimi = new Cat();

        System.out.println("luna: "+luna.getName());
        //String str =new String (); the constructor below is created similar to what we saw in String.
        Cat bella = new Cat("Bella");
        System.out.println(bella.getName());



    }
}
