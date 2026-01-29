package objectOrientedProgramming.classandObjects.level1;

/*
 Program to track inventory of items
*/
class Item {

    // instance variables
    int itemCode;
    String itemName;
    double price;

    // constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // method to calculate total cost
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // method to display item details
    void displayItemDetails(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost(quantity));
    }

    // main method
    public static void main(String[] args) {
        Item item = new Item(201, "Pen", 10);
        item.displayItemDetails(5);
    }
}

