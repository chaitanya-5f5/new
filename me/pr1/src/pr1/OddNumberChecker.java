package pr1;
public class OddNumberChecker {
    public static void main(String[] args) {
        try {
            int number = 5; // Replace this with the desired number
            checkIfEven(number);
            System.out.println(number + " is an even number.");
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method that checks if the given number is odd and throws an exception if true
    private static void checkIfEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("OddNumberException: " + number + " is an odd number.");
        }
    }
}

// Custom exception class for odd numbers
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

