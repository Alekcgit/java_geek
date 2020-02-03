public class AnimalsApp {
  public static void main(String[] args) {
    System.out.println("---------");
    Animal animaldef = new Animal();
    Animal animal = new Animal("Дружок", "Черный", 7, 1);
    Dog dog = new Dog("Шарик", "Серый", 3, 2);
    Cat cat = new Cat("Барсик", "Белый", 2, 3);
    Cat cat1 = new Cat("Мурзик", "Рыжий", 3, 4);

    animaldef.info();
    cat1.info();
    animal.info();
    cat.info();
    dog.info();
    System.out.println("---------");
    cat.jump(50, cat.nameAnimal);
    dog.flee(900);
    System.out.println("---------");
    dog.name = "Алый";
    cat.flee(250);
    cat.swim(10);
    dog.swim(11);
    System.out.println("---------");
    System.out.println(cat.getName());
    printVoices(cat, dog, animal);
    System.out.println("---------");
    System.out.println("Колличество животных - " + Animal.getCount());
  }

  // private static void printVoices(Animal... animals) {
  // System.out.println("printVoices");
  // for (Animal animal : animals) {
  // animal.info();
  // }
  private static void printVoices(Object... animals) {
    System.out.println("printVoices-Obj");
    for (Object animal : animals) {
      System.out.println(animal.toString());
    }
  }
}