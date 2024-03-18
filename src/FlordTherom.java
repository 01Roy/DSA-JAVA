public class FlordTherom {
    public static void main(String[] args) {
        System.out.println("floyd therom ");
        int count = 0;
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                count += 1;
                System.out.print(count + " ");
            }
            System.out.println(" ");
        }
    }
}
