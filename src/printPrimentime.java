public class printPrimentime {
    public static void main(String[] args) {
        boolean isPrime = true;
        for (int num = 2; num <= 100; num++) {
            if (num == 2) {
                System.out.println(num + " is Prime");
            } else {
                for (int i = 2; i <= num - 1; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                    }
                }

                if (isPrime == true) {
                    System.out.println(num + " is Prime");
                } else {
                    System.out.println(num + " is NotPrime");
                }
            }
            isPrime = true;
        }
    }

}
