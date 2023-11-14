// Function overrindding its depends on no. of parameter used inside the function not on thier return type

public class FunctionOverRiding {
    public static int Sum1(int a, int b) {
        return a + b;
    }

    public static int Sum1(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("the sum of number is " + Sum1(2, 3, 4));
    }

}
