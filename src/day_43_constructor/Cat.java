package day_43_constructor;

public class Cat {


    private String name;
    //constructor
    public Cat(){
        System.out.println("CAT constructor");
        name ="unknown";

    }
    public Cat (String name){
        System.out.println("Cat constructor with name" );
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
