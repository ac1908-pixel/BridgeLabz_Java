package objectOrientedProgramming.constructors.level3;

/*
 * Subclass accessing public and
 * protected members of Book.
 */
public class Ebook extends Book {

    // Displays ebook details
    void display() {
        System.out.println(ISBN + " " + title);
    }
}

