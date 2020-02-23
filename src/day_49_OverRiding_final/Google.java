package day_49_OverRiding_final;

public class Google extends SearchEngine {


@Override
    public int search(String item){
        System.out.println("Googling for ...."+item + "\nreturning results count");

        return item.length()*2;
    }

    protected void getResults(){ //we could type public instead of protected.
        System.out.println("Google displaying results ....");

    }
    protected void getResults(int num){ //we could type public instead of protected.
        System.out.println("Google displaying results ....");

    }

    protected String getResults(int num, double nm){ //we could type public instead of protected.
        System.out.println("Google displaying results ....");
    return "....";
    }
    String clickResult(){
        System.out.println("Clicking result of Google");
        return "Google item details.";
    }

}
