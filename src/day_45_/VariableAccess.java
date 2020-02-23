package day_45_;

public class VariableAccess {

    int instanceCount =10;
    static int staticCount = 15;

    public static void staticMethod(){

        /*if the method is non static it can call both static and non-static data types. */
      //  System.out.println("instanceCount: "+instanceCount); //if method is static we cannot call non-static data type
        System.out.println("staticCount: "+staticCount);
    }

    public void nonStaticInstanceMethod(){ //the method is non-static and can call both static and non-static variables
        System.out.println("instanceCount: "+instanceCount);
        System.out.println("staticCount: "+staticCount);
    }

    public static void main(String [] args){
        //variable access
        //System.out.println("instanceCount: "+instanceCount);Error
        System.out.println("staticCount: "+staticCount);

        //method access
        staticMethod();
       // nonStaticInstanceMethod();Error
        //how to access instance(non-static) variable/method
        //first create object using new keyword

        VariableAccess vbObj = new VariableAccess();
        System.out.println("instanceCount = " + vbObj.instanceCount);
        vbObj.nonStaticInstanceMethod();


    }
}
