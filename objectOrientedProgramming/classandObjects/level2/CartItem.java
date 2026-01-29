package objectOrientedProgramming.classandObjects.level2;

/*
 Program to simulate a shopping cart
*/
class CartItem {

    // attributes of CartItem
    String itemName;
    double price;
    int quantity;

    // constructor
    CartItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }

    // method to add item to cart
    void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " item(s) added");
    }

    // method to remove item from cart
    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " item(s) removed");
        } else {
            System.out.println("Not enough items to remove");
        }
    }

    // method to display total cost
    void displayTotalCost() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + (price * quantity));
    }

    // main method
    public static void main(String[] args) {
        CartItem item = new CartItem("Notebook", 50);
        item.addItem(3);
        item.removeItem(1);
        item.displayTotalCost();
    }
}

