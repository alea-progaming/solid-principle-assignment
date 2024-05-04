
public class OrderTest {

	public static void main(String[] args) {
		TotalCalculator calculator = new CalculateTotal();
        Order order = new Order("John Doe", "123 Main St", calculator);

        OrderProcessor orderProcessor = new PlaceOrder();
        InvoiceGenerator invoiceGenerator = new GenerateInvoice();
        NotificationSender notificationSender = new SendEmailNotification();
        
        
        orderProcessor.placeOrder(order);
        invoiceGenerator.generateInvoice("order_123.pdf");
        notificationSender.sendEmailNotification("johndoe@mail.com");
        System.out.println("Order total: $" + calculator.calculateTotal(10.0, 2));

	}
}
