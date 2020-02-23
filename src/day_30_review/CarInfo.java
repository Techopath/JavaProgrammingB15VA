package day_30_review;

public class CarInfo {
    public static void main(String[] args) {
        String car = "MINI-Cooper";
        /*
        Split or use substring to print out make, model of car

         */
        //1st way
        String [] carArr = car.split("-");
        String make = carArr[0];
        String model = carArr[1];
        //2nd way using substring indexOf

//        String Make = car.substring(0,car.indexOf("-"));
//        String Model =car.substring(car.indexOf("-")+1);

        //print out stars replaced with model length amount.
        String stars = "";
        for (int i = 1; i <=model.length(); i++) {
            stars = stars +"*";
        }

        //when we have one statement to do we can use the following way too
        //for (int i=1;i<=model.length();i++) stars +="*";
        System.out.println(stars);

        String carModelMasked = model +"-"+ stars;
        System.out.println(carModelMasked);
    }
}
