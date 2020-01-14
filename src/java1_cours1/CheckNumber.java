package java1_cours1;

public class CheckNumber {
    public static void main(String[] args) {
        // Задание 4
        int c1 = 4;
        int c2 = 10;
        int c3 = c1 + c2;
        if (c3 > 10 && c3 <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        // Задание 5
        int b = 5;
        if (b >= 0) {
            System.out.println(b + " - Число положительное");
        } else {
            System.out.println(b + " - Число отрицательное");
        }
        // Задание 7
        priName("Олег");
        varNeg(5);
    }

    // Задание 7
    public static void priName(String name) {
        String hw = "Привет, " + name;
        System.out.println(hw);
    }

    // Задание 6
    public static boolean varNeg(int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }
}
