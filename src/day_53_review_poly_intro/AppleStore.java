package day_53_review_poly_intro;

public class AppleStore {

    public static void main(String[] args) {

        // AppleDevice appDev = new AppleDevice(); //not working


        AppleWatch iWatch = new AppleWatch();

        iWatch.name = "Apple Watch";

        iWatch.series = 5;
        iWatch.name ="AppleWatch";
        iWatch.use();
        iWatch.wear();
        iWatch.countSteps();

        System.out.println("Iphone object ----------------");
        IPhone iPhone = new IPhone();


        iPhone.name ="Iphone";
        iPhone.model = "pro 11";
        iPhone.use();
        iPhone.code();
        iPhone.wear();
        iPhone.navigation();


        System.out.println();

        MacPro macPro = new MacPro();
        macPro.name = "Mac Pro";
        macPro.model = "TrashCan";
        macPro.use();
        macPro.code();
        macPro.useAsServer();
        System.out.println();




    }
}
