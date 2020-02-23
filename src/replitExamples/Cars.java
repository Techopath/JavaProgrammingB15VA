package replitExamples;

public class Cars {
    public static void main(String[] args) {
        GasTank car1 = new GasTank(9.5);
        car1.addGas(3.0);
        car1.useGas(10.0);
        System.out.println(car1.isEmpty());

        System.out.println(car1.isFull());
        System.out.println(car1.getGasLevel());
       car1.fillUp();
    }
}
