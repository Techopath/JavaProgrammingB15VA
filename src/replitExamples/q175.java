package replitExamples;

import java.util.Arrays;

public class q175 {
    public static String lameDb(String db, String op,String id,String data)

//"1etsy#2wooden#3spoon","add","4","aaa"


    {
        String dataBase[] = db.split("#");

        String nDB = "";
        if (op.equals("add")) {

            db = db + "#"+id + data;

        } else if (op.equals("none")) {

            db = db;
        }

        if (op.equals("edit")){
            String toBeAdded = id+data;

            for (int i = 0; i < dataBase.length; i++) {
                if (dataBase[i].startsWith(id)){

                    dataBase[i] = dataBase[i].replace(id,"");


                }


            }
            for (int i = 0; i < dataBase.length; i++) {
                nDB = nDB +dataBase[i]+"#";
            }

            return nDB;

        }

        return db;
    }//end lameDb




    public static void main(String[] args)
    {


        System.out.print(
                lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
        );


        System.out.print(
                lameDb("1tst#2bla#3foo","delete","1","")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","none","1","")+"\n"
        );

    }
}
