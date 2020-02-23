package day_11_String_comparis_logical;

public class USSTATES_MultiBranchIfStatements {
    public static void main(String[] args) {
        String state = "VA";

        if(state.equals("VA")){
            System.out.println("VA is Virginia");
        }else if (state.equals("NY")){
            System.out.println("New York");
        }else if(state.equals("IL")){
            System.out.println("Illinois");
        }else if (state.equals("CA")){
            System.out.println("California");
        }
    }
}
