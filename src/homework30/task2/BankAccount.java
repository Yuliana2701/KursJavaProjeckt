package homework30.task2;

class BankAccount implements PaymentSystem {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Вы сняли " + amount + " евро. Остаток на счете: " + balance + " евро.");
        } else {
            System.out.println("Недостаточно средств для снятия!");
        }
    }

    @Override
    public void depositTransfer(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Вы пополнили счет на " + amount + " евро. Остаток на счете: " + balance + " евро.");
        } else {
            System.out.println("Невозможно пополнить счет на отрицательную сумму!");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}