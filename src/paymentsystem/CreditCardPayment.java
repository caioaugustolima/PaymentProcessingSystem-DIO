package paymentsystem;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        // Lógica de processamento de pagamento com cartão de crédito
        System.out.println("Pagamento com cartão de crédito no valor de $" + amount);
    }
}
