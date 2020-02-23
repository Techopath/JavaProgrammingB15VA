package replitExamples;

public class q160_hamletLogic {
    public static void main(String[] args) {
        boolean trueFalse = hamletQuote(true, true);
        System.out.println(trueFalse);

    }

    public static boolean hamletQuote(boolean toBe, boolean notToBe) {
        boolean istrue = false;

        if (toBe == notToBe && toBe ==false && notToBe ==false){
            istrue =istrue;
        }else{
            istrue =true;
        }
//        if (toBe != notToBe) {
//           istrue = true;
//        } else if (notToBe== toBe && (notToBe ==true && toBe == true)) {
//            istrue = true;
//        } else {
//            istrue = istrue;
//
//        }
            return istrue;
    }
}
