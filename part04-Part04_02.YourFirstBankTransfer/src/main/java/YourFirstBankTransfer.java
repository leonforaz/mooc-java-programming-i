//Write a program that:
//
//    Creates an account named "Matthews account" with the balance 1000
//    Creates an account named "My account" with the balance 0
//    Withdraws 100.0 from Matthew's account
//    Deposits 100.0 to "my account"
//    Prints both the accounts

public class YourFirstBankTransfer {

    public static void main(String[] args) {
         Account matthewsAccount = new Account("Matthews account", 1000.00);
         Account myAccount = new Account("My account", 0.00);
        
        matthewsAccount.withdrawal(100.00);
        myAccount.deposit(100.00);
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
        // Do not touch the code in Account.java
        // write your program here
    }
}
