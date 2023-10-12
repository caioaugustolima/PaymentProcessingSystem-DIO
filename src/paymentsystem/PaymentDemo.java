package paymentsystem;

public class PaymentDemo {
    public static void main(String[] args) {
        Order order = new Order();

        // Escolha a estratégia de pagamento com cartão de crédito
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        order.setPaymentMethod(creditCardPayment);
        order.checkout(100.00);

        // Escolha a estratégia de pagamento com PayPal
        PaymentStrategy paypalPayment = new PayPalPayment("example@example.com");
        order.setPaymentMethod(paypalPayment);
        order.checkout(75.50);

        // Escolha a estratégia de pagamento em dinheiro na entrega
        PaymentStrategy cashOnDeliveryPayment = new CashOnDeliveryPayment();
        order.setPaymentMethod(cashOnDeliveryPayment);
        order.checkout(50.00);
    }
}
