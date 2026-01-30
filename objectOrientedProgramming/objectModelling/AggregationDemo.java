package objectOrientedProgramming.objectModelling;
import java.util.ArrayList;

/*
 * Book class
 * -----------
 * This class represents a Book entity.
 * A Book has its own existence and does NOT depend on any Library.
 * This supports the concept of aggregation.
 */
class Book {

    private String title;
    private String author;

    /*
     * Constructor to initialize Book details
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /*
     * Method to display book details
     */
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

/*
 * Library class
 * -------------
 * This class represents a Library.
 * A Library can have many Book objects.
 * Books can exist independently even if the Library is deleted.
 * This models an aggregation relationship.
 */
class Library {

    private String libraryName;
    private ArrayList<Book> books;

    /*
     * Constructor to initialize the library name
     * and create an empty list of books
     */
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    /*
     * Method to add a book to the library
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /*
     * Method to display all books in the library
     */
    public void displayBooks() {
        System.out.println("Books in " + libraryName + ":");

        // Loop through the list of books and display each one
        for (Book book : books) {
            book.displayBook();
        }
    }
}

/*
 * Main class
 * ----------
 * Demonstrates aggregation by creating Books
 * and adding them to different Libraries.
 */
public class AggregationDemo {

    public static void main(String[] args) {

        // Creating Book objects (independent of libraries)
        Book book1 = new Book("Clean Code", "Robert C. Martin");
        Book book2 = new Book("Effective Java", "Joshua Bloch");
        Book book3 = new Book("Design Patterns", "Erich Gamma");

        // Creating Library objects
        Library library1 = new Library("City Library");
        Library library2 = new Library("College Library");

        // Adding books to libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2); // Same book added to another library
        library2.addBook(book3);

        // Displaying books in each library
        library1.displayBooks();
        System.out.println();
        library2.displayBooks();
    }
}

