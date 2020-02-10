public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        plate.setFood(10);

        Cat cat1 = new Cat("Pirat", 0);
        Cat cat2 = new Cat("Пушок", 10);
        Cat cat3 = new Cat("Мурзик", 20);

        Cat arrCats[] = new Cat[9];
        arrCats[0] = new Cat("Barsik", 1);
        arrCats[1] = new Cat("Тиша", 3);
        arrCats[2] = new Cat("Вася", 0);
        arrCats[3] = new Cat("Persik", 0);
        arrCats[4] = new Cat("Pirat", 7);
        arrCats[5] = new Cat("Атаман", 2);
        arrCats[6] = new Cat("Пушок", 5);
        arrCats[7] = new Cat("Amur", 1);
        arrCats[8] = new Cat("Мурзик", 0);

        System.out.println("---------");
        System.out.println(cat1.toString());
        cat1.eat(plate);
        System.out.println(cat2.toString());
        cat2.eat(plate);
        System.out.println(cat3.toString());
        cat3.eat(plate);
        plate.infoFood();
        System.out.println("---------");

        for (int i = 0; i < 9; i++) {
            System.out.println(arrCats[i]);
            arrCats[i].eat(plate);
        }

        plate.infoFood();
        System.out.println(plate.getFood());
    }
}