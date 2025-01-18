public class Reversenumber {

    // Function to reverse the number
    public static int rev(int n) {
        return revHelper(n, 0);
    }

    // Helper function to handle the recursion
    private static int revHelper(int n, int reversed) {
        // Base case: when n becomes 0, return the reversed number
        if (n == 0) {
            return reversed;
        }

        // Recursively reverse the digits, add the current digit to the reversed value
        return revHelper(n / 10, reversed * 10 + n % 10);
    }

    public static void main(String[] args) {
        System.out.println(rev(349)); // Output will be 943
    }
}



