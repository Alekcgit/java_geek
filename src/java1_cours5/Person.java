// Задание 4 - 5
public class Person {
  String name;
  String position;
  String email;
  String telephone;
  int wage;
  int age;

  public Person(String name, String position, String email, String telephone, int wage, int age) {
    this.name = name;
    this.position = position;
    this.email = email;
    this.telephone = telephone;
    this.wage = wage;
    this.age = age;
  }

  public static void main(String[] args) {
    Person[] persArray = new Person[5];
    persArray[0] = new Person("Иванов Сергей Викторович", "Инженер", "ivan@gmail.com", "89270678309", 3000, 41);
    persArray[1] = new Person("Петров Виктор Сергеевич", "Мастер", "peter@gmail.com", "89278675317", 3111, 42);
    persArray[2] = new Person("Волков Андрей Васильевич", "Элмонтер", "volkov@gmail.com", "89275078771", 2000, 20);
    persArray[3] = new Person("Миронов Алексей Юрьевич", "Начальник", "mir@gmail.com", "89276612588", 5000, 38);
    persArray[4] = new Person("Семенов Михаил Алексеевич", "Диспетчер", "cemen@gmail.com", "89270678309", 4321, 25);
    System.out.println("-----------------------");
    System.out.println("Cотрудники старше 40 лет");
    System.out.println("Имя                       Должность Элпочта          Телефон     Зарплата Возраст ");
    for (int i = 0; i < persArray.length; i++) {
      if (persArray[i].age > 40)
        System.out.println(persArray[i].name + " - " + persArray[i].position + " - " + persArray[i].email + " - "
            + persArray[i].telephone + " - " + persArray[i].wage + " - " + persArray[i].age);
    }
  }
}