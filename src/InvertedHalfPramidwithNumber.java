public class InvertedHalfPramidwithNumber {
    public static void main(String[] args) {

        System.out.println("Inverted falf pramid with numbers");

        int totalRow = 5;
        int totalCol = 5;
        for (int i = 1; i <= totalRow; i++) {
            for (int j = 1; j <= totalCol - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

}
