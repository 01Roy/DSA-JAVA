public class CheckPrimewithfunc {

    // public static boolean isPrime(int n) {
    // for (int i = 2; i <= n - 1; i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    // Optimised way
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Printing the prime number with the range

    public static void PrimeInRange(int n) {
        for (int i = 1; i <= n; i++) {
            boolean printPrime = isPrime(i);
            if (printPrime) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        PrimeInRange(100);
    }

}
