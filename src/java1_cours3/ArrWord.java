import java.util.Random;
import java.util.Scanner;
// Урок 3 Задание 2
public class ArrWord {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] words = { "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
        "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
        "pepper", "pineapple", "pumpkin", "potato" };
    Random rand = new Random();
    int r = rand.nextInt(words.length - 1);
   // System.out.println("Длина массива words " + words.length);
    //System.out.println("Случайное число " + r);
    System.out.println("---------");
    System.out.println("Введите слово");
    String wor = words[r];
    int lin = wor.length();
    //System.out.println(lin);
    char a = wor.charAt(0);
    char b = wor.charAt(1);
  // System.out.println(wor);
    String wor1 = (sc.next()).toLowerCase();
    int i = 0;
    int d1 = 0;
    while (i < lin) {
      if (wor.equals(wor1)) {
      System.out.println("Верно");
      System.out.println(wor.equals(wor1));
        i = lin;
      } else {
        System.out.println("не верно");
        System.out.println(wor.equals(wor1));
        System.out.println("---------");
        i++;
        for (d1 = 0; d1 < i; d1++) {
          System.out.print(wor.charAt(d1));
        }
        System.out.println();
        wor1 = (sc.next()).toLowerCase();
      } 
    }
    System.out.println("Верно"); 
    sc.close();
  }
}
