package MyWrittenCodes;

public class RightTriangle {
    public static void main(String[] args) throws Exception {


        printHollowRect();
    }
    public static void printHollowRect () throws InterruptedException {
        int n=5;
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= n; j++) {
                if (j ==0 || i ==n || i==j){
                    System.out.print("* ");
                    Thread.sleep(500);
                }else{
                    System.out.print("  ");
                    Thread.sleep(200);
                }
            }
            System.out.println();

        }

    }

}
