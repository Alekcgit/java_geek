package java1_cours1;

public class FirstApp {
    // Задание 1
    /*
     * public static void main(String[] args) {
     * 
     * }
     */
    // Задание 2
    public static void main(String[] args) {
        byte varByte;
        short varShort;
        int varInt;
        int varInt1 = 1, varInt2 = 12, varInt7 = 75;
        long varLong;
        float varFloat;
        double varDouble;
        char varChar;
        boolean varBoolean;
        varByte = 125;
        varShort = -32667;
        varInt = 20000;
        varLong = 10L;
        varFloat = 24.25F;
        varDouble = 24.254;
        varChar = 'e';
        varBoolean = true;

        System.out.println(umnSumDel(5, 4, 6, 2));
    }

    // Задание 3
    public static float umnSumDel(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }
}