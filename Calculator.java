import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, res;
        char op;

        System.out.println("Enter first number:");
        a = sc.nextInt();

        System.out.println("Enter second number:");
        b = sc.nextInt();

        System.out.println("Enter operation (+, -, *, /):");
        op = sc.next().charAt(0);

        switch (op) {
            case '+':
                res = a + b;
                System.out.println("Result: " + res);
                break;
            case '-':
                res = a - b;
                System.out.println("Result: " + res);
                break;
            case '*':
                res = a * b;
                System.out.println("Result: " + res);
                break;
            case '/':
                if (b != 0) {
                    res = a / b;
                    System.out.println("Result: " + res);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
        sc.close();
    }
}
