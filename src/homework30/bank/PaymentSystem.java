package homework30.bank;


public interface PaymentSystem {

    void withdrawMoney(double amount);
    void depositTransfer(double amount);
    double checkBalance();

    void transferMoney(double amount, PaymentSystem recipient);
    String getCurrency();
    String getTitle();

    // Получение курса Валюта счета к евро.
    double getCourseToEur();
}
