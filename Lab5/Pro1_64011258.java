/*Program# 1(Exercise 9.7 p.361 The Account class)
Write a test program that creates an Account object with an account ID of 1122,
a balance of $20,000, and an annual interest rate of 4.5%. Use the withdrawmethod to withdraw $2,500
, use the deposit method to deposit $3,000, and print the balance, the monthly interest, and the date
when this account was created.  */
public class Pro1_64011258 {

    public static void main(String[] args) {
        //Account account = new Account(1122,20000);
        Account account = new Account();
        account.setId(1122);
        account.setBalance(20000);
        account.setAnnualInterestRate(4.5);
        account.deposit(3000.0);
        account.withdraw(2500.0);
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date Created: $" + account.getDateCreated());
    }
}

