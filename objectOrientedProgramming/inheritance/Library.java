package objectOrientedProgramming.inheritance;

class Book {
    protected String title;
    protected int publicationyear;

    Book(String title, int publicationyear){
        this.title = title;
        this.publicationyear = publicationyear;
    }

}

class Author extends Book {
    private String name;
    private String bio;

    Author(String name, String bio, String title, int publicationyear){
        super(title, publicationyear);
        this.name = name;
        this.bio = bio;
    }

    public void displayInfo(){
        System.out.println(name + " " + bio + " " + title + " " + publicationyear);
    }

}

public class Library{
    public static void main(String args[]){
        Author auth = new Author("Alok", "This is the bio", "This is the title", 1290);
        auth.displayInfo();
    }
}
