package day_46_inheritance_intro;

public class Employee extends Person {

    public boolean hasChild;

    public String jobTitle;

    public void work(){
        System.out.println(name + " works as an SDET");
    }



}
