import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        char action = 0;
        float operand1 = 0;
        float operand2 = 0;
        while (run) {
            action = 0;
            System.out.println("Введите первый операнд:");
            operand1 = scanner.nextInt();
            while (action != 'c') {
                System.out.println("Введите действие:(Можно использовать только + , - , * или /)\nДля выхода нажмите s, чтобы начать с начала - с");
                action = scanner.next().charAt(0);
                if (action == 's') {
                    System.out.println("Работа закончена. До свидания!");
                    run = false;
                    break;
                }
                if (action == 'c') {
                    System.out.println("Начинаем с начала");
                    break;
                }
                if (action != '+' && action != '-' && action != '*' && action != '/' ) {
                    System.out.println("Неверный оператор, начинаем с начала");
                    break;
                }
                System.out.println("Введите второй операнд:");
                operand2 = scanner.nextInt();
                System.out.println("Результат:" + compute(operand1, operand2, action));
                operand1 = compute(operand1, operand2, action);
            }

        }
    }


    public static float compute (float a, float b, char operator) {
        float result=0;
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Такой операции не существует");
        }
            return result;
    }
}
