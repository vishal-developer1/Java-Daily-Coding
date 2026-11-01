
public class Calculator {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 0;
        char operator = '/';

        if (operator == '+') {
            System.out.println("Addition = " + (num1 + num2));

        } else if (operator == '-') {
            System.out.println("Subtraction = " + (num1 - num2));

        } else if (operator == '*') {
            System.out.println("Multiplication = " + (num1 * num2));

        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("Cannot divide by zero");

            } else {
                System.out.println("Division = " + (num1 / num2));
                
            }
        }
    }
}
