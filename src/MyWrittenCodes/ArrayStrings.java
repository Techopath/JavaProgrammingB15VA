package MyWrittenCodes;

public class ArrayStrings {
    public static void main(String[] args) {
        String[] str ={"you", "is ", "house", "book", "pen"};
        int length= str.length;
        for(int i=0; i<length; i++){
            if (!str[i].contains("book")){
            }else{
                System.out.println("Found");
            }
        }
    }
}
