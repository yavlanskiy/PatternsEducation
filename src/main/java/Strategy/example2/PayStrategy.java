package Strategy.example2;

/**
 * Общий интерфейс всех стратегий.
 */
public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
