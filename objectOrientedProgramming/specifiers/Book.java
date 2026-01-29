package objectOrientedProgramming.specifiers;
/*
 * Book class demonstrates:
 * - static variables and methods
 * - use of this keyword
 * - final variable
 * - instanceof operator
 */
public class Book {

    // Static variable shared across all Book objects
    static String libraryName = "BridgeLabz Central Library";

    // Instance variables
    String title;
    String author;

    // Final variable (cannot be modified once assigned)
    final String isbn;

    /*
     * Constructor
     * Uses 'this' keyword to initialize instance variables
     */
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    /*
     * Static method to display library name
     */
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    /*
     * Method to display book details
     * Uses instanceof to verify object type
     */
    public void displayBookDetails(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            System.out.println("Title  : " + book.title);
            System.out.println("Author : " + book.author);
            System.out.println("ISBN   : " + book.isbn);
        } else {
            System.out.println("Invalid object. Not a Book instance.");
        }
    }

    public static void main(String[] args) {

        // Display static library name
        Book.displayLibraryName();
        System.out.println();

        // Creating Book objects
        Book book1 = new Book("Clean Code", "Robert C. Martin", "9780132350884");
        Book book2 = new Book("Effective Java", "Joshua Bloch", "9780134685991");

        // Display book details using instanceof check
        book1.displayBookDetails(book1);
        System.out.println();
        book2.displayBookDetails(book2);
    }
}

