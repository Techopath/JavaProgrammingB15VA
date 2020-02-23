package day_21_For_loop_4_arrayintro;

public class NestedLoop {
    public static void main(String[] args) {
        for (int n=0; n<=9;n++){
            for (int inner = 0; inner <=n ; inner++) {

                System.out.print(inner +" ");
            }
            System.out.println();
    }
            /*
            0
            01
            012
            0123
            01234
            012345
            0123456
            01234567
            012345678
            0123456789

             */
//            for (int outer=0; outer <=9;outer++){
//                for (int inner = 0; inner<=9;inner++){
//                    System.out.print(inner +" ");
//                }
//                System.out.println();
//            }
                        /*
            0
            01
            012
            0123
            01234
            012345
            0123456
            01234567
            012345678
            0123456789
            012345678
            01234567
            0123456
            ..
            .
             */
        //System.out.println();
        for (int outer=8; outer >=0;outer--){
            for (int inner =0 ; inner<=outer;inner++){
                System.out.print(inner +" ");
            }
            System.out.println();
        }


    }
}
