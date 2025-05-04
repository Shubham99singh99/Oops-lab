class Customer {
    private double balance; // Private variable

    // Public method to add balance (double amount)
    public void addBalance(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount added: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // Overloaded method to add balance (int amount)
    public void addBalance(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount added: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // Protected method to deduct balance
    protected void deductBalance(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount deducted: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds!");
        }
    }

    // Default access method to show balance
    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();

        // Using overloaded methods
        customer.addBalance(500.50);  // double method
        customer.addBalance(200);     // int method

        // Showing balance
        customer.showBalance();

        // Deducting balance
        customer.deductBalance(300);
        customer.showBalance();
    }
}
