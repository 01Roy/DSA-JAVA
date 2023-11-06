import java.util.Scanner;

public class PrintPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n == 2) {
            System.out.println("n is Prime");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime == true) {
                System.out.println("n is Prime");
            } else {
                System.out.println("N is not prime");
            }
        }

    }

}
