package objectOrientedProgramming.classandObjects.level1;

/*
 Program to handle mobile phone details
*/
class MobilePhone {

    // instance variables
    String brand;
    String model;
    double price;

    // constructor
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // method to display mobile phone details
    void displayPhoneDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    // main method
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Samsung", "Galaxy S23", 74999);
        phone.displayPhoneDetails();
    }
}

