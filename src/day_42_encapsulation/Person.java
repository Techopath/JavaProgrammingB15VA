package day_42_encapsulation;

public class Person {
    //encapsulate below variables---add private before the data type
   private String name; //default value is null
    private int age; //default value is zero 0

    //getter/setter for age
    //read only

    public int getAge(){
        return age;
    }

    //setter -write only

    //getter /setter for name
    //read only
    public void setAge(int newAge){
        if(newAge>0 && newAge<=170){
            age = newAge;
        }else{
            System.out.println("Age cannot be negative or 0");
        }
    }

    public String getName(){
        return name;
    }

    //setter -write only
    public void setName(String newName){
        if(!newName.isEmpty()){
            name =newName;
        }else{
            System.out.println("Error: name cannot be empty");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
