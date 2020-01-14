package java1_cours1;

public class leapYear {
    public static void main(String[] args) {
        int got = 16;
        int varGot = 4;
        int gotSto = 100;
        int gotFre = 400;
        if (got % varGot == 0 && got % gotSto != 0 || got % gotFre == 0) {
            System.out.println(got + " Високосный - " + got % varGot);
        } else {
            System.out.println(got + " Невисокосный - " + got % varGot);
        }
    }
}
