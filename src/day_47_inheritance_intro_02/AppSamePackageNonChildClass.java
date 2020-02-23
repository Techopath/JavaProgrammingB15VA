package day_47_inheritance_intro_02;

public class AppSamePackageNonChildClass {

    public static void main(String[] args) {
        App app = new App();
        app.name = "Evernote";
        app.developer = "Evernote LLC";
        app.system = "iOS, Android, Google";
        //app.price = 22.33; //Error: accessibility problem due to private

    }


}
