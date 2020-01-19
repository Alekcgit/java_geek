package java1_cours2;
// Задание 6
public class ArrSumLR {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 10, 4, 4, 21};
        sumArr(arr);
    }
        static int[] sumArr (int[] arr) {
        boolean bolt=true, bolf=false;
        int arrit = 0, arrlef = 0, arrez = 0;
            for (int i = 0; i < arr.length; i++) {
                arrlef += arr[i];
                if (i == arr.length - 3) {
                    System.out.println(arrlef + " arrlef");
                    arrez = arrlef;
                }
                if (i > arr.length - 3) {
                    arrit += arr[i];
                }
            }
            System.out.println(arrit + " arrit");
            if (arrez == arrit) {
                System.out.println(bolt);
            } else {
                System.out.println(bolf);
            }
            return arr;
        }
}
