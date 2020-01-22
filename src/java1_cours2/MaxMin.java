//Урок 2 Задание 5
public class MaxMin {
    public static void main(String[] args) {
        int[] arr = { 9, 5, 3, 2, 11, 4, 5, 11, 3, 8, 9, 7 };
        int arrmi = arr[0];
        int arrma = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arrmi) {
                arrmi = arr[i];
            }
            if (arr[i] > arrma) {
                arrma = arr[i];
            }
        }
        System.out.println("---------");
        System.out.println("Минимальное число в массиве arrmi = " + arrmi);
        System.out.println("Максимальное число в массиве arrma = " + arrma);
    }
}
