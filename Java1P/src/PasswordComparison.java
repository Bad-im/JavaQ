import java.util.Scanner;

public class PasswordComparison {

    public static void main(String[] args) {
        try (// Получить пароль из командной строки
                Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите пароль:");
            String password = scanner.nextLine();

            // Строка-образец пароля
            String samplePassword = "secret";

            // Сравнить пароль со строкой-образцом
            boolean isCorrect = password.equals(samplePassword);

            // Вывести результат сравнения
            if (isCorrect) {
                System.out.println("Пароль правильный.");
            } else {
                System.out.println("Пароль неправильный.");
            }
        }
    }
}
