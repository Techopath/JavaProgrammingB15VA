package day_53_review_poly_intro;

/*MacPro IS-A Apple Device,=>  when extends,
* Mac Pro CAN-Do/Has-A - CodeAble => when implements*/
/*Why we open interfaces => so that sub classes can implement them. in interface we use final variable which will not be changed.
* */



public class MacPro extends AppleDevice implements CodeAble{

    String model;
    public void useAsServer(){
        System.out.println(name + " model "+ model + " - using as application server...");
    }
    @Override
    public void use() {
        System.out.println(name + " model "+ model + " - using graphic design, movies, video gaming...");
    }
    @Override
    public void code() {
        System.out.println(name + " model "+ model + " - coding Java in IntelliJ...");
    }



}
