package day_52_interface;
/*multiple classes implement the same interface*/
public interface VoiceCallable {

    //public static final variables ONLY.

    /*todo:  Interfaces can only have PUBLIC for variables and methods*/

    public static final boolean canCall = true; //todo: public static final is by default there. we don't need to write it there.
    boolean CAN_CALL = false;

   // protected static final boolean canCall = true; //todo: this access modifier not allowed in interface

    //constructor
//    public VoiceCallable(){ //todo: interfaces cannot have constructors
//
//    }

    //abstract method
    //public abstract is automatically added, therefore they are green.

    public abstract void call(String Nadir); //no body for abstract classes.

    //only abstract methods before java 8. pure abstract!!
    //after java 8. - static and default methods added

    //static method
    public static void decline(String Nadir){ //static methods need implementation /body/
        System.out.println("Nadir declined voice call ...");
    }

//    public void hangUp(){ //non-abstract method cannot be used in interface.
//
//    }

    //default method:
    public default void accept(){ //default methods are used only in interfaces.

    }
}
