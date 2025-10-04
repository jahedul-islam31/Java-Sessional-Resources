import java.util.Scanner;

public class PrimeNumbersInArray {
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get range from user
        System.out.print("Enter starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();

        // Count how many prime numbers are in the range
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) count++;
        }

        // Store prime numbers in an array
        int[] primeArray = new int[count];
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeArray[index++] = i;
            }
        }

        // Print prime numbers
        System.out.println("\nPrime numbers in the range:");
        for (int prime : primeArray) {
            System.out.print(prime + " ");
        }

        scanner.close();
    }
}
