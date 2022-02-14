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

