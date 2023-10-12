package paymentsystem;

public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        // Lógica de processamento de pagamento com PayPal
        System.out.println("Pagamento com PayPal no valor de $" + amount);
    }
}
