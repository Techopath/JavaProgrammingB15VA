package replitExamples;
//question -206 oop
public class GasTank {
    //WRITE YOUR CODE HERE

    double amount =0;
    double capacity;

    public GasTank(){

    }

    public GasTank(double a){
        capacity =a;
    }

    public void addGas(double add){
        amount = amount +add;

        if (amount > capacity){
            amount =capacity;
        }
    }

    public void useGas(double use){
        amount = amount -use;

        if (amount <0){
            amount = 0;
        }
    }
    public boolean isEmpty(){
        if (amount<0.1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if (amount > capacity -0.1){
            return true;
        }else{
            return false;
        }
    }

    public double getGasLevel(){
        return amount;
    }

    public double fillUp(){
        amount = amount + capacity;

        return capacity - amount;
    }
}
