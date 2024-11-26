 class BankAccount{
    private double balance;

    public BankAccount(){
        this.balance=0.0;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }else{
            System.out.println("amount must be positive");
        }
    }
    public void withdraw(double amount){
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal not permitted.");
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            balance -= amount;
        }
    }

     public double getBalance() {
         return balance;
     }
 }

public class Q3_BankManagementSystem {
    public static void main(String args[]){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(100);
        bankAccount.withdraw(50);
        double balance = bankAccount.getBalance();
        System.out.println(balance);
        bankAccount.withdraw(100);

    }
}
