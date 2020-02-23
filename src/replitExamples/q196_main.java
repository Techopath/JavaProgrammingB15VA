package replitExamples;

public class q196_main {
    public static void main(String[] args) {

        q196 db = new q196();
        db.insertData("ali",-1);
        System.out.println(db.getData());
        System.out.println(db.getYint());
        db.setData("alican");
        db.setYint(601);

        System.out.println(db.getYint());
        System.out.println(db.getData());

    }
}
