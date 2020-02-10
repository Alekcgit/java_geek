import java.util.Scanner;

public class Plate {
    private int food;
    Scanner scanner = new Scanner(System.in);

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(String name, int appetite, Boolean satiety) {
        if (0 >= (food -= appetite)) {
            System.out.println("Еда закончилась " + food);
           // System.exit(0);
            System.out.print("Добавьте еды в тарелку. Введите число: ");
             food=scanner.nextInt();
        } else {
            System.out.printf("Ocталось еды: %d, Кот: %s, Апетит: %d, Cытость: %b%n------------------%n",
            food, 
            name,
            appetite = 0, 
            satiety = true);
        }
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void infoFood() {
        System.out.println("plate: " + food);
    }

}