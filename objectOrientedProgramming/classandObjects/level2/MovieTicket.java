package objectOrientedProgramming.classandObjects.level2;

/*
 Program to model a movie ticket booking system
*/
class MovieTicket {

    // attributes of MovieTicket
    String movieName;
    int seatNumber;
    double price;

    // constructor
    MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    // method to book ticket
    void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully");
    }

    // method to display ticket details
    void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    // main method
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception");
        ticket.bookTicket(15, 250);
        ticket.displayTicket();
    }
}

