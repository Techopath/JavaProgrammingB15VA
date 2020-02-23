package MyWrittenCodes;

public class Triangle {
    public static void main(String[] args) throws Exception {


        printHollowRect();
    }
    public static void printHollowRect () throws InterruptedException {
        int n=4;
        int m=n+3;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <m; j++) {
                if (i ==3 || (i==i && j==(m/2)-i) || (i==i && j==m/2+i)){
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
