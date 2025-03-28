import java.util.Scanner;

public class InfixToPostfixMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an infix expression: ");
        String infixExpression = scanner.nextLine();

        String postfixExpression = InfixToPostfix.infixToPostfix(infixExpression);

        System.out.println("Postfix Expression: " + postfixExpression);

        scanner.close();
    }
}