package corePrograms.strings.level1;

/*
 Program to demonstrate NullPointerException
*/
class NullPointerException {

    // method to generate exception
    public static void generateException() {
        String text = null;
        text.length();
    }

    // method to handle exception
    public static void handleException() {
        try {
            String text = null;
            text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    // main method
    public static void main(String[] args) {
        // generateException();   // uncomment to see abrupt stop
        handleException();
    }
}

