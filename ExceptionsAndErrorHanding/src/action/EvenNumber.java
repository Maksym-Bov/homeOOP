package action;
import java.util.Scanner;

public class EvenNumber {
/*
Напишите программу которая определяет, является ли число четным или нет.
 Проверять только целые числа.
 Добавить обработку ошибок с описанием
* */
    public   void determinesNumberEvenOrNotEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number, please");
        String response = null;
        try {
            int number = scanner.nextInt();
            response = (number % 2 == 0) ? "Even" : "Not even";
            System.out.println(response);
        } catch (Exception exception) {
            System.out.println("Error, need enter number");
            exception.printStackTrace();
        } finally {
            System.out.println(response);
        }

    }
}
