package day_40_custom_classes;
import java.util.*;
public class Bank {
    public static void main(String[] args) {
        //create object checkingAccount
        System.out.println("\n--------------Create an object called boa-------------");
        CheckingAccount  boa = new CheckingAccount();
        boa.setInfo(10000, 45505347452L, "Ali Mahmud");
        //call getAccountInfo method
        boa.getAccountInfo();
        boa.deposit(200);
        boa.withdrawing(200);
        boa.purchase(200);
        //call
        boa.best();
        //create another object
//        System.out.println("\n----------create another object called clientTwo--------");
//        CheckingAccount clientTwo = new CheckingAccount();
//        clientTwo.balance = 500;
//        clientTwo.accountHolder = "Mr.Who?";
//        clientTwo.accountNumber = 45430000005454L;
//        System.out.println("--------------------");
//        clientTwo.getAccountInfo();
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the amount you want to deposit: ");
//        double toDeposit = scan.nextDouble();
//
//        clientTwo.deposit(toDeposit);
//        System.out.println("Enter withdrawal amount: ");
//        int toWithdraw = scan.nextInt();
//        clientTwo.withdrawing(toWithdraw);
//        System.out.println("Enter the amount you purchased: ");
//        double toPurchase = scan.nextDouble();
//        clientTwo.purchase(toPurchase);
//        clientTwo.best();

        //call itemPurchase method
        System.out.println("-----object named myAccount---------");
        CheckingAccount myAccount = new CheckingAccount();
        myAccount.setInfo(200, 455465563212L, "Ali");
        myAccount.itemPurchase("book", 98);
        System.out.println("current balance: $"+myAccount.balance);
        myAccount.itemPurchase("shoes", 120);
        myAccount.itemPurchase("tyres", 450);
        //balance is -538
        System.out.println("Coded lots of java, and landed an SDET job");
        System.out.println("First month salary is direct deposited");

        myAccount.deposit(10000);


        System.out.println("---create another object called client3-----");


    }
}
