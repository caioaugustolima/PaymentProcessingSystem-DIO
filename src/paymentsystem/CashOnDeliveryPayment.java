package paymentsystem;

public class CashOnDeliveryPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        // Lógica de processamento de pagamento em dinheiro na entrega
        System.out.println("Pagamento em dinheiro na entrega no valor de $" + amount);
    }
}
