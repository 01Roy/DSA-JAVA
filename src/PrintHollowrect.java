public class PrintHollowrect {

    public static void Hollow_Reactangel(int rows, int cols) {
        // outer rows
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hollow_Reactangel(4, 5);
    }
}
