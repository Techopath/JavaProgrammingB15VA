package day_43_constructor;

public class Pet {
    String type;
    String name;
    public Pet(){
        System.out.println("Pet no-args constructor");
    }public Pet(String type, String name){
        this.type = type;
        this.name = name;
    }

    public void speak(){
        System.out.print(name +" is saying ");
        switch (type) {
            case "dog":
                System.out.println("gav gav");
                break;
            case "cat":
                System.out.println("meow meow");
                break;
            case "fish":
                System.out.println("...");
                break;
            case "bird":
                System.out.println("chrek chrek");
                break;
            case "lion":
                System.out.println("rooaarr rooaarr");
                break;
            default:
                System.out.println("java java");
        }
    }

    public void setPetInfo(String type, String name){
        this.type = type;
        this.name = name;
    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type =type;

    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }



    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
