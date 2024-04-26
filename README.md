## Problem Scenario

Improve the following codes to implement SOLID principles in OOP.

```
public interface solidPrinciples.PlaceOrder {

  void calculateTotal(double price, int quantity);

  void placeOrder(String customerName, String address);

  void generateInvoice(String fileName);

  void sendEmailNotification(String email);
}

public class OrderAction implements solidPrinciples.PlaceOrder {

  @Override
  public void calculateTotal(double price, int quantity) {
    double total = price * quantity;
    System.out.println("solidPrinciples.PlaceOrder total: $" + total);
  }

  @Override
  public void placeOrder(String customerName, String address) {
    // Simulate placing order in a system
    System.out.println("solidPrinciples.PlaceOrder placed for " + customerName + " at " + address);
  }

  @Override
  public void generateInvoice(String fileName) {
    // Simulate generating invoice file
    System.out.println("Invoice generated: " + fileName);
  }

  @Override
  public void sendEmailNotification(String email) {
    // Simulate sending email notification
    System.out.println("Email notification sent to: " + email);
  }
}

public class OrderTest {

  public static void main(String[] args) {
    solidPrinciples.PlaceOrder order = new OrderAction();
    order.calculateTotal(10.0, 2);
    order.placeOrder("John Doe", "123 Main St");

    // These methods might not be needed for all orders
    order.generateInvoice("order_123.pdf");
    order.sendEmailNotification("johndoe@example.com");
  }
}
```

## Class Diagram
![UML SOLID Principles](https://github.com/AeronRedCelajes/solidPrinciples/assets/142370807/7e4262e6-638a-4997-a560-588e0c13707d)
