//Задание 2
public class TestWorker {


    public static void main(String[] args) {
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();

        System.out.println("Worker1: " + worker1);

        worker2.name = "Тимонов Петр Петрович";
        worker2.position = "Главный инженер";
        worker2.email = "timon@gmail.com";
        worker2.telephone = "9279178343";
        worker2.wage = 48000;
        worker2.age = 48;
        System.out.println("Worker2: " + worker2);

     
        worker3.name = "Тимонов Петр Петрович";
        worker3.email = "timon@gmail.com";
        worker3.telephone = "9279178343";
        worker3.age = 48;
        System.out.println("Worker3: " + worker3);

        Worker worker5 = new Worker("Савельев Сергей Сергеевич", "Ведущий инженер", "savel@gmail.com", "89270461748", 25000, 35);
        System.out.printf("Имя: %s, Должность: %s, Элпочта: %s, Телефон: %s, Зарплата: %d, Возраст: %d\n", worker5.name, worker5.position, worker5.email,  worker5.telephone,  worker5.wage, worker5.age);
    }
}