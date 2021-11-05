//The exercise template comes with a ready-made class named Account. 
//The Account object represents a bank account that has balance 
//(i.e. one that has some amount of money in it). 
//The accounts are used as follows:

//Write a program that creates an account with a balance of 100.0, 
//deposits 20.0 in it, and finally prints the balance. 
//NB! Perform all the operations in this exact order.
public class YourFirstAccount {

    public static void main(String[] args) {

        Account artosAccount = new Account("Arto's account", 100.00);
        
        artosAccount.deposit(20);
        System.out.println(artosAccount);
        
        // Do not touch the code in Account.java
        // Write your program here
    }
}
