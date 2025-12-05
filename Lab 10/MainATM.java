
interface ATMService {
    void withdraw(double amount);

    void deposit(double amount);

    void checkBalance();
}

class DBBL implements ATMService {
    double balance;

    DBBL(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Successful. New Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful. New Balance: " + balance);
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class MainATM {
    public static void main(String[] args) {
        DBBL atm = new DBBL(5000);

        atm.deposit(1000);
        atm.withdraw(2000);
        atm.checkBalance();
    }
}

