public class SumAndProduct {

    public static void main(String[] args) {
        // Проверить, были ли введены аргументы командной строки
        if (args.length == 0) {
            System.out.println("Необходимо ввести целые числа в качестве аргументов командной строки.");
            return;
        }

        // Инициализировать переменные для суммы и произведения
        int sum = 0;
        int product = 1;

        // Перебрать аргументы командной строки и преобразовать их в целые числа
        for (String arg : args) {
            int number = Integer.parseInt(arg);

            // Добавить число к сумме
            sum += number;

            // Умножить число на произведение
            product *= number;
        }

        // Вывести результат на консоль
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
    }
}
