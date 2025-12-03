class BankAccount {

    private String accountHolder;
    private String accountNumber;
    private double balance;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

class Main2 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();

        b1.setAccountHolder("Fahim");
        b1.setAccountNumber("AC98731");
        b1.setBalance(15000.50);

        System.out.println("Account Holder: " + b1.getAccountHolder());
        System.out.println("Account Number: " + b1.getAccountNumber());
        System.out.println("Balance: " + b1.getBalance());
    }
}
