# Sistema de Processamento de Pagamentos

Este projeto é um exemplo simples de como implementar o padrão de projeto Strategy em Java para lidar com diferentes métodos de pagamento em um sistema de comércio eletrônico.

## Padrão de Projeto Utilizado

- **Strategy**: O padrão Strategy é usado para definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis. Ele permite alternar dinamicamente entre diferentes estratégias de pagamento.

## Estrutura do Projeto

- `paymentsystem`: Pacote que contém todas as classes relacionadas ao sistema de pagamento.

## Classes Principais

- `PaymentStrategy`: Interface que define o contrato para as estratégias de pagamento.
- `CreditCardPayment`: Implementação da estratégia de pagamento com cartão de crédito.
- `PayPalPayment`: Implementação da estratégia de pagamento com PayPal.
- `CashOnDeliveryPayment`: Implementação da estratégia de pagamento em dinheiro na entrega.
- `Order`: Classe que representa um pedido com o método de pagamento.

## Como Usar

1. Crie instâncias das classes `CreditCardPayment`, `PayPalPayment`, ou `CashOnDeliveryPayment`, conforme necessário, para representar diferentes métodos de pagamento.
2. Configure a estratégia de pagamento desejada para um pedido, chamando o método `setPaymentMethod` na classe `Order`.
3. Use o método `checkout` na classe `Order` para processar o pagamento com a estratégia selecionada.

## Exemplo de Uso
```java
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
```
## Contribuição

Sinta-se à vontade para contribuir para este projeto, abrindo problemas ou enviando solicitações de pull. Todas as contribuições são bem-vindas.
