import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Получить количество случайных чисел от пользователя
            System.out.println("Введите количество случайных чисел:");
            int count = scanner.nextInt();

            // Создать объект Random для генерации случайных чисел
            Random random = new Random();

            // Вывести случайные числа без перехода на новую строку
            System.out.println("Случайные числа без перехода на новую строку:");
            for (int i = 0; i < count; i++) {
                System.out.print(random.nextInt(11) + " ");
            }

            // Вывести случайные числа с переходом на новую строку
            System.out.println("\nСлучайные числа с переходом на новую строку:");
            for (int i = 0; i < count; i++) {
                System.out.println(random.nextInt(11));
            }
        }
    }
}
