public class App {

    public static void main(String[] args) {
        System.out.println(performOperation(2.0, 2.0, '-'));
    }

    public static double performOperation(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    return 0;
                } else {
                    return num1 / num2;
                }
            default:
                System.out.println("Invalid operator");
                return 0;
        }
    }
    
}
