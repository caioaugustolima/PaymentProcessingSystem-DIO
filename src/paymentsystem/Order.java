package paymentsystem;

public class Order {
    private PaymentStrategy paymentMethod;

    public void setPaymentMethod(PaymentStrategy paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(double totalAmount) {
        paymentMethod.processPayment(totalAmount);
    }
}
