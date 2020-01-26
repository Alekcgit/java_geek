import java.util.Random;
import java.util.Scanner;
// Урок 4 Задание3
public class X5O {
    public static int SIZE = 5;
    public static final char BOX_X = 'X';
    public static final char BOX_EMPTY = '•';
    public static final char BOX_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            if (checkWin(BOX_X)) {
                System.out.println("Вы победили");
                printMap();
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(BOX_O)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
    public static boolean checkWin(char symb) {
        for (int a=0; a<2; a++) { 
        for (int i=0; i<5; i++) 
        if ((map[i][a+0]==symb && map[i][a+1]==symb && map[i][a+2]==symb && map[i][a+3]==symb )||
        (map[a+0][i]== symb && map[a+1][i]==symb && map[a+2][i]==symb && map[a+3][i]==symb))
        return true;
        if ((map[a+0][a+0]==symb && map[a+1][a+1]==symb && map[a+2][a+2]==symb && map[a+3][a+3]==symb)||
        (map[a+0][4-a]== symb && map[a+1][3-a]==symb && map[a+2][2-a]==symb && map[a+3][1-a]==symb))
        return true;
        if ((map[a+0][1-a]==symb && map[a+1][2-a]==symb && map[a+2][3-a]==symb && map[a+3][4-a]==symb )||
        (map[a+0][3+a]== symb && map[a+1][2+a]==symb && map[a+2][1+a]==symb && map[a+3][0+a]==symb))
        return true;
        }
        return false;
    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == BOX_EMPTY) return false;
            }
        }
        return true;
      }
      public static void aiTurn() {
          int x, y;
          do {
              x = rand.nextInt(SIZE);
              y = rand.nextInt(SIZE);
          } while (!isCellValid(x, y));
          System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
          map[y][x] = BOX_O;
      }
      public static void humanTurn() {
          int x, y;
          do {
              System.out.println("Введите координаты в формате X Y");
              x = sc.nextInt() - 1;
              y = sc.nextInt() - 1;
          } while (!isCellValid(x, y)); 
          map[y][x] = BOX_X;
      }
      public static boolean isCellValid(int x, int y) {
          if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
          if (map[y][x] == BOX_EMPTY) return true;
          return false;
      }
      public static void initMap() {
          map = new char[SIZE][SIZE];
          for (int i = 0; i < SIZE; i++) {
              for (int j = 0; j < SIZE; j++) {
                  map[i][j] = BOX_EMPTY;
              }
          }
      }
      public static void printMap() {
        System.out.println("---------");
          for (int i = 0; i <= SIZE; i++) {
              System.out.print(i + " ");
          }
          System.out.println();
          for (int i = 0; i < SIZE; i++) {
              System.out.print((i + 1) + " ");
              for (int j = 0; j < SIZE; j++) {
                  System.out.print(map[i][j] + " ");
              }
              System.out.println();
          }
          System.out.println();
      }
  }