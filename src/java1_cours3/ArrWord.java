import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Урок 3 Задание 2
public class ArrWord {
  public static final int FAKE_WORD_LENGTH = 15;
  public static final String[] WORDS = new String[] { "apple", "orange", "lemon", "banana", "apricot", "avocado",
      "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
      "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato" };

  public static void main(String[] args) {
    Random random = new Random();
    int index = random.nextInt(WORDS.length);
    String targerWord = WORDS[index];
    String userWord = null;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("---------");
      System.out.println("Угадайте слово: ");
      userWord = scanner.nextLine();
      if (isWin(targerWord, userWord)) {
        System.out.printf("Верно! Это слово %s%n", targerWord);
        break;
      }
      System.out.println("Не верно! Ниже тебе подсказка.");
      for (int i = 0; i < FAKE_WORD_LENGTH; i++) {
        char chr = '#';
        if (i < userWord.length() && i < targerWord.length() && userWord.charAt(i) == targerWord.charAt(i)) {
          chr = userWord.charAt(i);
        }
        System.out.print(chr);
      }
      System.out.println();
    } while (true);
    System.out.println("Игра окончена");
  }

  private static boolean isWin(String targetWord, String userWord) {
    return targetWord.equals(userWord);
  }
}