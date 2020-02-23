package day_46_inheritance_intro;

//this is a parent class **or base class
public class Person {

    public String name;
    public int age;
    public char gender;

    public void eat(){
        System.out.println(name + " is eating some meal");
    }

    public void walk(){
        System.out.println(name+" is walking");
    }

    public void speak(){
        if(name.equalsIgnoreCase("nadir")){
            System.out.println(name +" is talking non-stop.");

        }else{
            System.out.println(name + " is talking slowly");
        }
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
