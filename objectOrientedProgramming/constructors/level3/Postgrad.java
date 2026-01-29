package objectOrientedProgramming.constructors.level3;

/*
 * Subclass demonstrating access
 * to protected members.
 */
public class Postgrad extends Student {

    // Displays postgraduate details
    void display() {
        System.out.println(rollNumber + " " + name);
    }
}
