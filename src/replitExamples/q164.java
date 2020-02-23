package replitExamples;

public class q164 {
    public static void main(String[] args) {
        System.out.println(simpleRoomBook(true,7,2,2018));
    }
    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
    {


        if(isAvailable == true && month ==1 && (day>=1 && day<=8) && year ==2018  ){
            return true;

        }
        else
        {
            return false;

        }

    }
}
