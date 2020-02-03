// Задание 1-4
public class Animal {
  protected String name;
  protected String color;
  protected int age;
  protected int id;
  protected String nameAnimal="Кот - ";
  private static int сount;

  public Animal(String name, String color, int age, int id) {
    this.name = name;
    this.color = color;
    this.age = age;
    this.id=id;
    сount++;
  }
// Конструктор с данными по умолчанию
  public Animal() {
    this("Друг", "Бело-черный", 5, 0);
  }
  public static int getCount() {
    return сount;
}
public String getName() {
  return name;
}
  public int getId() {
    return id;
}
  public void info() {
    System.out.println("name: " + getName() + " color: " + color + " age: " + age+ " id: "+id);
  }

  public void jump(int jupmM, String nameAnimal) {
    System.out.printf(nameAnimal+"Животное подпрыгнуло на %d%n", jupmM);
  }

  public void swim(int swimM) {
    System.out.printf("Животное проплыло %d%n", swimM);
  }

  public void flee(int fleeM) {
    System.out.printf("Животное пробежало %d%n", fleeM);
  }
@Override
public String toString() {
    return "Worker{" +
            "name='" + name + '\'' +
            ", color='" + color + '\'' +
            ", age=" + age +
            ", id=" + id +
            '}';
}
}