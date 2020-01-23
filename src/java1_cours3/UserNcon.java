import java.util.Random;
import java.util.Scanner;
// Урок 3 Задание 1
public class UserNcon {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Random rand = new Random();
        int r = rand.nextInt(5);
        int d = getNumberFromScanner("Введите целое число в пределах от 0 до 5", 0, 5);
        int zip = 1;
        int cont = 1;
        while (zip == 1) {
            while (d > r) {
                System.out.println("Попытка " + cont++);
                System.out.println("Загаданное число меньше");
                d = getNumberFromScanner("Введите целое число в пределах от 0 до 5", 0, 5);
                if (cont == 3 && d != r) {
                    System.out.println("Три попытки. Игра сначала");
                    r = rand.nextInt(5);
                    d = getNumberFromScanner("Введите целое число в пределах от 0 до 5", 0, 5);
                    cont = 1;
                }
            }
            while (d < r) {
                System.out.println("Попытка " + cont++);
                System.out.println("Загаданное число Больше");
                d = getNumberFromScanner("Введите целое число в пределах от 0 до 5", 0, 5);
                if (cont == 3 && d != r) {
                    System.out.println("Три попытки. Игра сначала");
                    r = rand.nextInt(5);
                    d = getNumberFromScanner("Введите целое число в пределах от 0 до 5", 0, 5);
                    cont = 1;
                }
                while (d > r) {
                    if (cont == 3 && d != r) {
                        System.out.println("Три попытки. Игра сначала");
                        r = rand.nextInt(5);
                        d = getNumberFromScanner("Введите целое число в пределах от 0 до 5", 0, 5);
                        cont = 1;
                    }
                    System.out.println("Попытка " + cont++);
                    System.out.println("Загаданное число меньше");
                    d = getNumberFromScanner("Введите целое число в пределах от 0 до 5", 0, 5);
                }
            }
            if (d == r) {
                System.out.println("Числа равны");
            }
            if (cont == 3) {
                System.out.println("Три попытки. Игра сначала");
                d = getNumberFromScanner("Введите целое число в пределах от 0 до 5", 0, 5);
            }
            Scanner z = new Scanner(System.in);
            System.out.println("Продолжить игру -1 Закончить -0");
            zip = z.nextInt();
            if (zip == 0) {
                System.out.println("Игра закончена");
            }
            if (zip == 1) {
                System.out.println("Игра продолжена");
                d = getNumberFromScanner("Введите целое число в пределах от 0 до 5", 0, 5);
            }
        }
        sc.close();
    }

    public static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }
}
