package MyWrittenCodes;

import java.util.Arrays;

public class Abc_OCA {
    public static void main(String[] args) {
        String x = "ABC";
        String y = "Tech";
        x.concat(y);
        System.out.println(x);
        System.out.println(x.concat(y));

        StringBuffer a = new StringBuffer("ABC");
        StringBuffer b = new StringBuffer("TECH");
        a.append(b);
        System.out.println(a);

        String s1 = "Hello";
        String s2 = "Friends";
        System.out.println(s1);
        System.out.println(s1.hashCode());
        s1 = s1+s2;
        System.out.println(s1);
        System.out.println(s1.hashCode());

        String z = "AA";
        String r = "r";
        System.out.println(z.hashCode());
        System.out.println(r.hashCode());

        int [][] d = new int [2][];
        long[][] l = new long[][]{{1,2},{3,4}};
        System.out.println(d.length);
        int[][] v = {{1,2,3},{3,4}};

        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(v[i][j]+" ");
            }
        }
//        System.out.println(v.length);
//        System.out.println(v[0][2]);

        int ivar =10;
        double dvar = 123;
        float fvar = 10;
      //ivar = fvar; //not compatible
        fvar = ivar;
        dvar = fvar;
     // fvar = dvar;//not compatible

        dvar= ivar;
    //  ivar=dvar;//not compatible

        System.out.println("Result A"+0+1);
        System.out.println("Result B"+(1)+(2));
}
}