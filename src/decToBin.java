public class decToBin {

    public static void decToBinary(int n) {
        int myNub = n;
        int pow = 0;
        int decNum = 0;
        while (n > 0) {
            int rem = n % 2;
            decNum = decNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }

        System.out.println("the decimal number is " + myNub + "= " + decNum);
    }

    public static void main(String[] args) {
        decToBinary(7);
    }

}
