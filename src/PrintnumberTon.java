import java.util.Scanner;

public class PrintnumberTon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the range of the number");
        int range = sc.nextInt();
        int counter = 1;
        while (counter <= range) {
            System.out.println(counter);
            counter++;
        }
    }
}
