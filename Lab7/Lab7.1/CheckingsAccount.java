public class CheckingsAccount 
    extends Account {

        // Attributes
        private double overdraftLimit;

        // Constructors
        public CheckingsAccount() {

        }

        public void setOverdraftLimit(double overdraftLimit){
            this.overdraftLimit = overdraftLimit;
        }

        public void withdraw(double amount){
            if(getBalance() - amount > overdraftLimit){
                setBalance(getBalance() - amount);
            }
            else
                System.out.println("Error : Amount exceeds overdraft limit.");
        }
    }