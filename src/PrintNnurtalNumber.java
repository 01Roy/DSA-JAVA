import java.util.Scanner;

public class PrintNnurtalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of time print natural number");
        int range = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while (counter <= range) {
            System.out.println(counter);
            sum += counter;
            counter++;
        }
        System.out.println(sum);

    }

}
