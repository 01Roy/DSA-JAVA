// 0-1 triangle therom
public class TriangleTherom {
    public static void main(String[] args) {
        System.out.println("0-1 triangle therom ");
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println(" ");
        }
    }
}
