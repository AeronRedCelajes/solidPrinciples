package solidPrinciples;

public class OrderTest {
    public static void main(String[] args) {
        // Printing of each interface's functionality
        TotalCalculator totalCalculator = new OrderAction();
        totalCalculator.calculateTotal(10.0, 2);

        PlaceOrder order = new OrderAction();
        order.placeOrder("John Doe", "123 Main St");

        InvoiceGenerator invoice = new OrderAction();
        invoice.generateInvoice("order_123.pdf");

        EmailNotify notification = new OrderAction();
        notification.sendEmailNotification("johndoe@example.com");
    }
}