package day_40_custom_classes;

public class CheckingAccount {
    double balance;
    long accountNumber;
    String accountHolder;
    String type = "checking";

    public void setInfo(double pBalance, long pAccountNumber, String pAccountHolder){
        balance = pBalance;
        accountHolder = pAccountHolder;
        accountNumber = pAccountNumber;
    }
    public void getAccountInfo(){
        System.out.println("Checking Account: $"+balance + ", "+accountNumber +", "+accountHolder);
    }
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("depositing  $"+amount +" to account number "+accountNumber +"\n Now the balance is "+balance);
    }

    public void withdrawing (double amount){
        System.out.println("withdrawing $"+amount +" from bank account number "+accountNumber);

        if (amount <= balance){
            balance -= amount;
            System.out.println("balance left = $"+balance);
        }else{
            System.out.println("The balance is insufficient by $-"+(amount-balance));
        }
    }

    public void purchase(double amount){
        if(amount < balance){
            balance -=amount;
            System.out.println("Your transaction for this purchase is successful.\n Your balance decreased by $-"+amount);
            System.out.println(" Your balance after purchase = $"+balance);

        }else{
            System.out.println("you have not enough amount in your account so that you can purchase these items. ");

        }
    }

    public void itemPurchase(String item, double price){
        System.out.println("purchasing " + item +" for $"+price);
        if (price <= balance){
            balance -= price;
        }else {
            System.out.println("InsufficientFundsException - Overdraft fee is applied");
            balance -= (price + 35);
        }
        System.out.println("transaction completed for "+item + ",current balance: "+balance);
    }

    public void best(){
        System.out.println("Mortgage makes your life easier haha");
    }
}
