import java.util.Random;
import java.util.Scanner;

// Урок 3 Задание 1
public class UserNcon {
    private static final int NUMBER_ATTEMPT = 3;
    private static final int NUMBER_MAX = 9;

    public static void main(String[] args) {
        Random random = new Random();
        int numberTarget = random.nextInt(NUMBER_MAX + 1);
        System.out.println(
                "Я загадал число от 0 до " + NUMBER_MAX + ". Угадай, какое? \nЧисло попыток " + NUMBER_ATTEMPT);
        Scanner scanner = new Scanner(System.in);
        for (int attempt = 0; attempt < NUMBER_ATTEMPT; attempt++) {
            System.out.printf("Попытка номер %d %n", attempt + 1);
            int userNumber = gerUserNumber(scanner);
            if (userNumber == numberTarget) {
                System.out.println("Верно! Вы отгадали! Это число " + numberTarget);
                break;
            } else if (userNumber < numberTarget) {
                System.out.println("Загаданное число больше " + userNumber);
            } else {
                System.out.println("Загаданное число меньше " + userNumber);
            }
        }
    }

    private static int gerUserNumber(Scanner scanner) {
        int result = -1;
        do {
            try {
                System.out.println("Введите число: ");
                String consoleLine = scanner.nextLine();
                int value = Integer.parseInt(consoleLine);
                if (value < 0 || value > NUMBER_MAX) {
                    System.out.println("Число вне диапазона, пробуй еще!");
                    continue;
                }
                result = value;
            } catch (NumberFormatException e) {
                System.out.println("Вводить можно только число!");
            }
        } while (result == -1);
        return result;
    }
}