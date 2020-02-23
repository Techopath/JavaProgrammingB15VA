package day_43_constructor;

import javax.swing.*;
import java.util.Arrays;

public class ComputerObjects {
    public static void  main (String [] args ){
        //create a computer no - args constructor
        Computer dell = new Computer();
        System.out.println(dell.getBrand() +" & "+dell.getOs() + " & "+dell.getPrice());



        //create a computer 3 args constructor

        Computer hp = new Computer("HP Pavilion", "Windows 10 pro", 1400,13 );

        Computer acer = new Computer("Acer123", "Windows 10",500,17);

        String [] names = new String[3];//create the object
        names[0] = "java";
        names[1] = "dog";
        names[2] = "myDOg";



        //Array for computers
        Computer [] compArray = new Computer[3];
        //shorter, use new keyword to assogn object to array
        compArray [0] = new Computer("Hp 14", "Windowsxp", 259,18);
        //longer
        Computer dellInsp = new Computer("dell inspiron", "win11", 349.99,14);
        compArray[1] = dellInsp;

        compArray[2] = new Computer("apple silver", "MacOs", 2599.9,46);

//call toString method for computers
        System.out.println(compArray[0].toString());
        System.out.println(compArray[1].toString());
        System.out.println(compArray[2].toString());

        System.out.println(Arrays.toString(compArray));//reads all the elements within compArray at a time.

        for (Computer/*Computer is like String*/ eachComputer: compArray){
            //print model
            System.out.println(eachComputer.getBrand());
        }

    }
}
