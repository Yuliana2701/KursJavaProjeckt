package homework30.task2;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(1000);
        ElectronicWallet eWallet = new ElectronicWallet(500);


        System.out.println("Операции с банковским счетом:");
        bankAccount.depositTransfer(200);
        bankAccount.withdrawMoney(100);
        System.out.println("Баланс на счете: " + bankAccount.checkBalance() + " евро.\n");

        System.out.println("===========================================\n");

        System.out.println("Операции с электронным кошельком:");
        eWallet.depositTransfer(100);
        eWallet.withdrawMoney(50);
        System.out.println("Баланс на кошельке: " + eWallet.checkBalance() + " долларов.");
    }
}


