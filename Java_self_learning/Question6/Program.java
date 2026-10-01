package Question6;

import java.util.Scanner;

//Parent Exception
class ECommerceException extends Exception {

 public ECommerceException(String message) {
     super(message);
 }
}


//Payment Exceptions
class PaymentException extends ECommerceException {

 public PaymentException(String message) {
     super(message);
 }
}

class PaymentFailedException extends PaymentException {

 public PaymentFailedException(String message) {
     super(message);
 }
}


//Inventory Exceptions
class InventoryException extends ECommerceException {

 public InventoryException(String message) {
     super(message);
 }
}

class OutOfStockException extends InventoryException {

 public OutOfStockException(String message) {
     super(message);
 }
}


//Shipping Exceptions
class ShippingException extends ECommerceException {

 public ShippingException(String message) {
     super(message);
 }
}

class InvalidAddressException extends ShippingException {

 public InvalidAddressException(String message) {
     super(message);
 }
}


//E-Commerce Application
class ECommerceApp {

 public void makePayment(double amount)
         throws PaymentException {

     if (amount <= 0) {
         throw new PaymentFailedException(
             "Invalid payment amount"
         );
     }

     System.out.println("Payment successful: " + amount);
 }


 public void checkInventory(int quantity)
         throws InventoryException {

     int stock = 5;

     if (quantity > stock) {
         throw new OutOfStockException(
             "Product is out of stock"
         );
     }

     System.out.println("Product available");
 }


 public void shipProduct(String address)
         throws ShippingException {

     if (address == null || address.trim().isEmpty()) {
         throw new InvalidAddressException(
             "Invalid shipping address"
         );
     }

     System.out.println("Product shipped to: " + address);
 }
}


//Main
public class Program{

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     ECommerceApp app = new ECommerceApp();

     try {

         System.out.print("Enter quantity: ");
         int quantity = sc.nextInt();

         System.out.print("Enter payment amount: ");
         double amount = sc.nextDouble();

         sc.nextLine();

         System.out.print("Enter shipping address: ");
         String address = sc.nextLine();

         // Inventory
         app.checkInventory(quantity);

         // Payment
         app.makePayment(amount);

         // Shipping
         app.shipProduct(address);

         System.out.println("Order completed successfully");

     }
     catch (PaymentException e) {

         System.out.println("Payment Error: "
                 + e.getMessage());

     }
     catch (InventoryException e) {

         System.out.println("Inventory Error: "
                 + e.getMessage());

     }
     catch (ShippingException e) {

         System.out.println("Shipping Error: "
                 + e.getMessage());

     }
     finally {
         sc.close();
     }
 }
}