// BankAccount.java
class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;
    
    // Static variable (shared by all objects)
    static String bankName = "Sonali Bank";
    
    // Constructor to initialize account details
    BankAccount(int number, String name, double bal) {
        accountNumber = number;
        accountHolderName = name;
        balance = bal;
    }

    // Static method to display the bank name
    static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    // Method to display account info
    void showAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

// Main class
public class BankMain {
    public static void main(String[] args) {
        // Show bank name
        BankAccount.showBankName();

        // Create two accounts
        BankAccount acc1 = new BankAccount(101, "Fahim ", 15000.50);
        BankAccount acc2 = new BankAccount(102, "Abir", 25000.75);

        // Display their info
        acc1.showAccountInfo();
        acc2.showAccountInfo();
    }
}
