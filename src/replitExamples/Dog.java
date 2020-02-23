package replitExamples;

public class Dog extends Animal {

    private String breed;
    private int humanYears;

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    public String toString(){
        return "Name: "+getName()+ "\nBreed: "+breed+"\nAge in calendar years: "+getAge()+"\nAge in human years: "+getAgeInHumanYears(getAge());
    }

    public int getAgeInHumanYears(int age){
        if(getAge() <= 2){
            humanYears = getAge()*11;
        }else{
            humanYears = 22+(getAge()-2)*5;
        }

        return humanYears;


    }

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){

        this.breed =breed;

    }



    public boolean equals(Dog dog){

        if(getName().equals(dog.getName()) && getAge() == dog.getAge() && breed.equals(dog.getBreed())){

            return true;

        }
        return false;


    }

}