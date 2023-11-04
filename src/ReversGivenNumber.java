public class ReversGivenNumber {
    public static void main(String[] args) {
        int revNum = 4321;
        int realNum = 0;
        while (revNum > 0) {
            int lastDigit = revNum % 10;
            realNum = (realNum * 10) + lastDigit;
            revNum /= 10;
        }
        System.out.println(realNum);
    }

}
