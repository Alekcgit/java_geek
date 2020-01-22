
public class ArrSumLR {
    public static void main(String[] args) {
        System.out.println(checkSum(new int[] { 2, 2, 2, 1, 2, 2, 10, 1 }));
        System.out.println(checkSum(new int[] { 3, 3 }));
        System.out.println(checkSum(new int[] { 8 }));
        System.out.println(checkSum(new int[] { 6, 7, 8 }));
        System.out.println(checkSum(new int[] { 6, 7, 8, 5 }));
        System.out.println(checkSum(new int[] { 1, 1, 1, 2, 1 }));
        System.out.println(checkSum(new int[] { 1, 5, 3, 2, 10, 4, 4, 20 }));
    }

    private static boolean checkSum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int leftSum = sum(array, 0, i);
            int rightSum = sum(array, i, array.length);
            if (leftSum == rightSum) {
                System.out.println("---------");
                System.out.println("Колличество элементов в массиве " + array.length);
                System.out.println("Cумма равна " + leftSum + "; Колличество элементов с левой стороны " + i);
                return true;
            }
        }
        System.out.println("---------");
        System.out.println("Колличество элементов в массиве " + array.length);
        System.out.println("Сумма неравна");
        return false;
    }

    private static int sum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }
}
