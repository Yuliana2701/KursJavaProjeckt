package homework30.task2;

class ElectronicWallet implements PaymentSystem {
    private double balance;

    public ElectronicWallet(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Вы сняли " + amount + " долларов. Остаток на кошельке: " + balance + " долларов.");
        } else {
            System.out.println("Недостаточно средств для снятия!");
        }
    }

    @Override
    public void depositTransfer(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Вы пополнили кошелек на " + amount + " долларов. Остаток на кошельке: " + balance + " долларов.");
        } else {
            System.out.println("Невозможно пополнить кошелек на отрицательную сумму!");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}