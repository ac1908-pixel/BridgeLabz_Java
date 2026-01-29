package objectOrientedProgramming.specifiers;

/*
 * Product class demonstrates:
 * - static variables and methods
 * - use of this keyword
 * - final variable
 * - instanceof operator
 */
public class Product {

    // Static variable shared across all Product objects
    static double discount = 0.0; // discount percentage

    // Instance variables
    String productName;
    double price;
    int quantity;

    // Final variable (unique product identifier)
    final int productID;

    // Static variable to auto-generate unique product IDs
    private static int idCounter = 1000;

    /*
     * Constructor
     * Uses 'this' keyword to initialize instance variables
     * Assigns unique product ID
     */
    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = ++idCounter;
    }

    /*
     * Static method to update discount percentage
     */
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated Discount: " + discount + "%");
    }

    /*
     * Method to display product details
     * Uses instanceof to validate object type
     */
    public void displayProductDetails(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            double totalPrice = p.price * p.quantity;
            double discountedPrice = totalPrice - (totalPrice * discount / 100);

            System.out.println("Product ID   : " + p.productID);
            System.out.println("Product Name : " + p.productName);
            System.out.println("Price        : " + p.price);
            System.out.println("Quantity     : " + p.quantity);
            System.out.println("Discount     : " + discount + "%");
            System.out.println("Final Amount : " + discountedPrice);
        } else {
            System.out.println("Invalid object. Not a Product instance.");
        }
    }

    public static void main(String[] args) {

        // Update discount for all products
        Product.updateDiscount(10);

        // Create Product objects
        Product prod1 = new Product("Laptop", 60000, 1);
        Product prod2 = new Product("Mouse", 800, 2);

        // Display product details
        prod1.displayProductDetails(prod1);
        System.out.println();

        prod2.displayProductDetails(prod2);
    }
}
