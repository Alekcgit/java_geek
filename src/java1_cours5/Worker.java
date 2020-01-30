//Задание 1 - 3
public class Worker {
    String name;
    String position;
    String email;
    String telephone;
    int wage;
    int age;

    public Worker() {
        this.name ="Семенов Алексей Андреевич";
        this.position = "Директор";
        this.email = "semenov@gmail.com";
        this.telephone = "9270064217";
        this.wage = 55000;
        this.age = 55;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", telephone'" + telephone + '\'' +
                ", wage=" + wage +
                ", age=" + age +
                '}';
    }


    public Worker(String name, String position, String email, String telephone, int wage, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.wage = wage;
        this.age = age;
    }

    public void infoWorker() {
        System.out.println("---------");
        System.out.println("Это конструктор класса Worker");
        System.out.println("Фамилия Имя Отчество: " + name + " Должность: " + position + " Электронная почта: " + email
                + " Рабочий телефон: " + telephone + " Зарплата: " + wage + " Возраст: " + age);

    }

    public static void main(String[] args) {
        Worker worker = new Worker("Иванов Сергей Степанович", "Инженер", "ivan@gmail.com", "89270431718", 4009, 41);
        worker.infoWorker();
    }

}