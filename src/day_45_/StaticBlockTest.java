package day_45_;

public class StaticBlockTest {

    public static void main(String[] args) {

        StaticBlock.staticMethod();
        StaticBlock stbObj = new StaticBlock();
        StaticBlock stbObj2 = new StaticBlock();
        StaticBlock stbObj3 = new StaticBlock();

        StaticBlock.InnerClass.innerClassStaticMethod();

    }
}
