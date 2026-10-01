package Question7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Product class
class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id + "  " + name + "  Rs." + price;
    }
}


// Order class
class Order {
    private int orderId;
    private ArrayList<Product> products;
    private double total;

    public Order(int orderId, ArrayList<Product> products, double total) {
        this.orderId = orderId;
        this.products = new ArrayList<>(products);
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId +
               ", Products: " + products +
               ", Total: Rs." + total;
    }
}


// Shopping Cart
class ShoppingCart {

    // Product ID -> Product
    private HashMap<Integer, Product> products;

    // Order history
    private ArrayList<Order> orderHistory;

    // Current cart
    private ArrayList<Product> cart;

    private int orderId = 1;


    public ShoppingCart() {
        products = new HashMap<>();
        orderHistory = new ArrayList<>();
        cart = new ArrayList<>();
    }


    // Add product to product collection
    public void addProduct(Product p) {

        if (products.containsKey(p.getId())) {
            System.out.println("Product ID already exists.");
            return;
        }

        products.put(p.getId(), p);

        System.out.println("Product added successfully.");
    }


    // Display all products
    public void displayProducts() {

        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        System.out.println("\nID   Name   Price");

        for (Product p : products.values()) {
            System.out.println(p);
        }
    }


    // Add product to cart
    public void addToCart(int id) {

        Product p = products.get(id);

        if (p == null) {
            System.out.println("Product not found.");
            return;
        }

        cart.add(p);

        System.out.println("Product added to cart.");
    }


    // Remove product from cart
    public void removeFromCart(int id) {

        for (Product p : cart) {

            if (p.getId() == id) {
                cart.remove(p);
                System.out.println("Product removed from cart.");
                return;
            }
        }

        System.out.println("Product not found in cart.");
    }


    // Display cart
    public void displayCart() {

        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        double total = 0;

        System.out.println("\n----- CART -----");

        for (Product p : cart) {
            System.out.println(p);
            total += p.getPrice();
        }

        System.out.println("Total = Rs." + total);
    }


    // Checkout
    public void checkout() {

        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        double total = 0;

        for (Product p : cart) {
            total += p.getPrice();
        }

        Order order =
                new Order(orderId++, cart, total);

        orderHistory.add(order);

        cart.clear();

        System.out.println("Order placed successfully.");
        System.out.println("Total amount = Rs." + total);
    }


    // Display order history
    public void displayOrderHistory() {

        if (orderHistory.isEmpty()) {
            System.out.println("No order history.");
            return;
        }

        System.out.println("\n----- ORDER HISTORY -----");

        for (Order order : orderHistory) {
            System.out.println(order);
        }
    }
}


// Main class
public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ShoppingCart cart = new ShoppingCart();

		int choice;

		do {

			System.out.println("\n===== SHOPPING CART =====");
			System.out.println("1. Add Product");
			System.out.println("2. Display Products");
			System.out.println("3. Add Product to Cart");
			System.out.println("4. Remove Product from Cart");
			System.out.println("5. Display Cart");
			System.out.println("6. Checkout");
			System.out.println("7. Order History");
			System.out.println("0. Exit");

			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:

				System.out.print("Enter product ID: ");
				int id = sc.nextInt();

				sc.nextLine();

				System.out.print("Enter product name: ");
				String name = sc.nextLine();

				System.out.print("Enter price: ");
				double price = sc.nextDouble();

				Product p = new Product(id, name, price);

				cart.addProduct(p);

				break;

			case 2:

				cart.displayProducts();

				break;

			case 3:

				System.out.print("Enter product ID: ");
				id = sc.nextInt();

				cart.addToCart(id);

				break;

			case 4:

				System.out.print("Enter product ID: ");
				id = sc.nextInt();

				cart.removeFromCart(id);

				break;

			case 5:

				cart.displayCart();

				break;

			case 6:

				cart.checkout();

				break;

			case 7:

				cart.displayOrderHistory();

				break;

			case 0:

				System.out.println("Thank you!");

				break;

			default:

				System.out.println("Invalid choice.");
			}

		} while (choice != 0);

		sc.close();
	}
}