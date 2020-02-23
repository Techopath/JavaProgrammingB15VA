package day_45_;

public class StaticBlock {
    //static block
    static{
        System.out.println("Static block - once before everything else");

//        if(6==5){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
    }

    public StaticBlock(){
        System.out.println("Constructor - runs everytime object is created");
    }
    public static void staticMethod(){
        System.out.println("Static Method");
    }

    public static class InnerClass{
        public static void innerClassStaticMethod(){
            System.out.println("hello inner class!!!");
        }
    }
}
