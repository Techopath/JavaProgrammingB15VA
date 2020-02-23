package replitExamples;

public class ZombieAttack_1_094 {

    public static void main(String[] args) {
        int inhabitants = -1;
        int count =0;
        if(inhabitants <=0){
            System.out.println("---- EXTINCT ----");
            return;
        }
        System.out.println("Day "+0+" ["+inhabitants+"]");
        for (int i = 0; i <= count; i++) {

            inhabitants = inhabitants/2;
            count ++;
            System.out.println("Day "+(i+1)+" ["+inhabitants+"]");

            if (inhabitants ==1){
                System.out.println("---- EXTINCT ----");
                return;

            }

        }
        System.out.println("count is "+count);
    }



}
