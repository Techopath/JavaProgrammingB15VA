package OfficeHoursMira;

/*
* OOP: encapsulation, inharitance, abstraction, polimorphism

        encapsulation:
            data hiding

            make the field private
            provide access using getters and setters

            benefit:
                security purpose (protect our data)
                we can control what we put inside the field
                easier to maintain (it helps us to avoid some
                errors in the code)

                example:
                    we have object where one of the fields
                    can be only negative int value

                   we directly assigned the negative value

                   we used this object in several places in our project

                   result: we will have a bunch of errors across the project
                            something is not working

                   to handle this we make this field private and we check the
                   value we want to assign directly in setter method

              If we try to assign value to the private field we will get
              compiler error.

              Constructor:
             constractor will be called every time we create an object
             using 'new' keyword
             plays the role of initializing an object (instance variables)

             requirements:
                - same name as a class name
                - can be with params or without
                - no return type
                - can be overloaded

              Example:
              String class:
             String word = new String("Lemon");

             If we don't declare any constructor in the class?
             - we are getting one no-args constructor with empty body by default

             I we provide constructor with params will we get the one by default?
             -No*/
/*class Office
private int floor
String department
private int unitNumber
boolean passEntry

create constructor with 2 params:
department
passEnty
--
the building that will have all Office objects has only 3 floors

Office units can only be 3 digits; cannot be 000
*/

import java.util.Spliterator;

public class Office {
    private int floor;
    String department;
    private int unitNumber;
    boolean passEntry;

    public Office(String department, boolean passEntry){
        //this. - it will point to the instance variable
        this.department = department;
        this.passEntry = passEntry;
    }

    public Office(){

    }

    public int getFloor(){
        return floor;
    }
    public void setFloor(int floor){

        if(floor>=1 && floor<=3){
            this.floor = floor;
        }else{
            System.out.println("invalid floor: should be from 1 to 3");
        }

    }
    public int getUnitNumber(){
        return unitNumber;
    }
    public void setUnitNumber(int unitNumber){
        String unit_text = unitNumber +"";
        if(unit_text.length()==3 && (unit_text.startsWith("1") || unit_text.startsWith("2") || unit_text.startsWith("3"))){
            this.unitNumber = unitNumber;

        }else{
            System.out.println("Unit is invalid: ");
        }
    }

    @Override
    public String toString() {
        return "Office{" +
                "floor=" + floor +
                ", department='" + department + '\'' +
                ", unitNumber=" + unitNumber +
                ", passEntry=" + passEntry +
                '}';
    }

    public static void main(String[] args) {
        Office office1 = new Office();
        office1.passEntry =true;
        office1.department = "Customer solutions";
        office1.setFloor(3);
        office1.setUnitNumber(303);

        Office office2 = new Office("IT", false);
        office2.setUnitNumber(202);
        office2.setFloor(2);



    }

}
