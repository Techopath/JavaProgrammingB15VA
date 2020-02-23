package day_52_interface;
import java.util.*;

/*abstract class can have */
public abstract class MessagingApp{


    /*we can add instance variables in abstract classes*
    todo ALL ACCESS MODIFIERS are allowed for variables, static and instance methods //
     Abstract methods cannot be private, static and final.  */

    public String name;
    private static int count;
    protected boolean isFree;
    boolean allOSCompatible;
    public static final String APP_TYPE = "Messenger" ;

    //constructor

    public MessagingApp(){

    }



    //abstract method
    public  abstract void sendMessage(String msg);

    //non-abstract method
    public void launch(){
        System.out.println("MessagingApp is launching ...");
    }
    //static method
    public static void close(){
        System.out.println("Messaging app is closing ...");
    }





}
