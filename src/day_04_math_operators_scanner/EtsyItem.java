package day_04_math_operators_scanner;

public class EtsyItem {
    public static void main(String [] args){
        /*
        EtsyItem:
                Title -> String
                Seller -> String
                stars -> double
                RatingsCount -> double
                Price -> double
                BestSeller - > boolean
                FreeShipping -> boolean
         */
        String title = "Soup cook off Personilized Wooden Spoon ";
        String seller = "Personilized Gallery";
        double stars = 5.0;
        int ratingsCount = 8901;
        double price = 8.99;
        boolean bestSeller = true;
        boolean freeShipping = true;
        System.out.println("Item Title is: " +title +"\nSeller is: <" + seller +">" +"\nProduct has "
                + stars +" stars" +"\nNumber of people reviewed: " + ratingsCount +"\nThe price is: $" + price +"\nIs it bestseller? "
                + bestSeller +"\nIs shipping free? " +freeShipping +" Great!");
        System.out.println("Thanks for choosing " +"\""+ title +"\"");


    }
}
