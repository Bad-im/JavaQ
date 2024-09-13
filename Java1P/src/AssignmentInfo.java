import java.time.LocalDateTime;

public class AssignmentInfo {

    public static void main(String[] args) {
        // Фамилия разработчика
        String developerName = "Иванов";

        // Дата и время получения задания
        LocalDateTime receiveDateTime = LocalDateTime.now();

        // Дата и время сдачи задания
        LocalDateTime submitDateTime = LocalDateTime.now().plusDays(7);

        // Вывести информацию о задании
        System.out.println("Фамилия разработчика: " + developerName);
        System.out.println("Дата и время получения задания: " + receiveDateTime);
        System.out.println("Дата и время сдачи задания: " + submitDateTime);
    }
}
