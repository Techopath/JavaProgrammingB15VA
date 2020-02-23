package replitExamples;

public class q156_countAppearance {
    public static void main(String[] args) {
        String[] strArr = {"a","foo", "bar","foo", "bla","a", " "};
        String str = " ";
        int cnt = countAppearance(strArr, str);
        System.out.println("cnt = " + cnt);

    }
    public static int  countAppearance(String[] arr,String t){
        int count =0;
        for (int i = 0; i <arr.length ; i++) {
            if (t.equals(arr[i])){
                count ++;
            }
        }
        return count;

    }

}
