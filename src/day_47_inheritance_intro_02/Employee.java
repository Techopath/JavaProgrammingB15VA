package day_47_inheritance_intro_02;
import java.lang.*;
public class Employee extends Object{
   private String name;
    private String title;

    public Employee(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public Employee(){
        super(); //should be in the first statement in constructor


        System.out.println("emp constructor with no args");

        //super(); cannot be placed here
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
