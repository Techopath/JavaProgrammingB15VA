package day_49_OverRiding_final;

public /*final*/ class SearchEngine { // if final keyword is in the code, then you cannot extend subclass to this class.

    public int search(String item){
        System.out.println("Searching for ... " + item +"\nreturning results count..");
        return item.length();
    }

    public int search(String item, int nums){
        System.out.println("Searching for ... " + item +"\nreturning results count..");
        return item.length();

    }

    protected void getResults(){
        System.out.println("Search Engine displaying results....");
    }
    String clickResult(){
        System.out.println("Clicking result of search engine");
        return "SearchEngine item details";
    }
}

