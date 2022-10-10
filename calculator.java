import java.util.*;
public class calculator {
    public static void main(String[] args) {
        System.out.println("ENTER FIRST NUMBER");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int secondNumber = sc.nextInt();

        int result;
        System.out.println("ENTER AN OPERATOR (+, -, *, /): ");

        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+': 
            result = firstNumber + secondNumber;
            System.out.println(result);
            break;

            case '-':
            result = firstNumber - secondNumber;
            System.out.println(result);
            break;

            case '*':
            result = firstNumber*secondNumber;
            System.out.println(result);
            break;

            case '/':
            result = firstNumber / secondNumber;
            System.out.println(result);
            break;

            default:
            System.out.println("INVALID INPUT");
        }

    }
}
