package day_46_inheritance_intro;

import day_45_.Vehicle;

public class SchoolTeam {


    public static void main(String[] args) {

        Person marufjon = new Person();
        marufjon.name = "Marufjon";
        marufjon.age = 34;
        marufjon.gender = 'M';
        //marufjon.course = "Python"; //Error: when we have additional variable in child class, it doesnt go to parent class.

        marufjon.walk();
        marufjon.speak();
        //marufjon.jobTitle = "teacher"; //Error: cannot go to Employee class and call jobTitle;because Employee is not a parent class.

        marufjon.eat();
///-----------------------------------------
        System.out.println("-+++-++-+-+-+-");
        Student nadir = new Student();
        nadir.name = "Nadir";
        nadir.age = 35;
        nadir.gender ='M';
        nadir.course = "SDLC vs STLC";
        nadir.speak();
        nadir.walk();
        nadir.work();
        nadir.eat();
//----------------------------------------------
        Employee me = new Employee();
        me.name = "Muhammad";
        me.age = 27;
        me.gender ='M';
        me.walk();
        me.speak();
        me.hasChild = true;
        me.eat();


        System.out.println(me.toString());

        System.out.println("---------------------++++++++++++--------------------------");

        Employee kiki = new Employee();
        kiki.name = "Kiki";
        kiki.age = 43;
        kiki.gender = 'F';
        kiki.walk();
        kiki.speak();
        kiki.jobTitle = "IT specialist";
        kiki.work();
        kiki.eat();









    }
}
