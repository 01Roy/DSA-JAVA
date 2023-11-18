
public class BinaryToDecimal {
    public static void binTODec(int binNum) {
        int myBin = binNum;
        int pow = 0;
        int dec = 0;
        int lastDig;

        while (binNum > 0) {
            lastDig = binNum % 10;
            dec = dec + (lastDig * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("the binary number is " + myBin + "into decimal " + dec);
    }

    public static void main(String[] args) {
        binTODec(111);
    }

}
