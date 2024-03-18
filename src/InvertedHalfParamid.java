public class InvertedHalfParamid {

    public static void main(String[] args) {
        System.out.println("Print Inverted Paramid");
        int totalRow = 5;
        int totalCol = 5;

        for (int i = 1; i <= totalRow; i++) {
            for (int j = 1; j <= totalCol; j++) {
                if (j <= totalCol - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }

    }

}
