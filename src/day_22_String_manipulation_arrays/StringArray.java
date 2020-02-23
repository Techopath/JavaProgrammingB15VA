package day_22_String_manipulation_arrays;

public class StringArray {
    public static void main(String[] args) {
        String[] cities={"ankara", "moscow", "kabul", "dushanbe", "manila", "tashkent", "fairfax", "kulyab"};
        int citiesLength = cities.length;
        for(String city: cities){
            if(city.length() >6 ){
                //System.out.print(city+" ");
            }
//            else if(city.contains("u")) {
//                System.out.println(city);
//
//            }
        else if (city.contains("ul")){
                System.out.println(city);
            }

        }

    }
}
