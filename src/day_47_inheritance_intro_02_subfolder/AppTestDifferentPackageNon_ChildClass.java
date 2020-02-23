package day_47_inheritance_intro_02_subfolder;
import day_47_inheritance_intro_02.App;
public class AppTestDifferentPackageNon_ChildClass {

    public static void main(String[] args) {
        App app = new App();
        app.name = "Day One";
        //not visible
//        app.developer = "Bloom Built Inc";
//        app.system = "iOs";
//        app.price = 0.0;
    }
}
