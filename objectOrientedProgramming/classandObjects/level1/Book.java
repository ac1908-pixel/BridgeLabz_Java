package objectOrientedProgramming.classandObjects.level1;

/*
 Program to handle book details
*/
class Book {

    // instance variables
    String title;
    String author;
    double price;

    // constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // method to display book details
    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    // main method
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "James Gosling", 499.99);
        book.displayBookDetails();
    }
}
