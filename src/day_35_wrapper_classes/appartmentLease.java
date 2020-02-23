package day_35_wrapper_classes;

public class appartmentLease {
    public static void main(String[] args) {
        applyForApartment(670);
        applyForApartment(450);
        applyForApartment(-1);
        applyForApartment(1000);
    }
    public static void qualify(){
        System.out.println("Congratulations, your application for apartment is approved! ");
    }
    public static void notQualify(){
        System.out.println("Unfortunately, your application for apartment is denied. Code more Java!");
    }

    public static void applyForApartment(int creditScore){

        if (creditScore >= 650 && creditScore< 850){
            qualify();
            //System.out.println("Qualify");
        }else{
            //System.out.println("Not Qualify");
            notQualify();
        }
    }
}
