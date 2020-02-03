public class Dog extends Animal {

    public Dog(String name, String color, int age, int id) {
    super(name, color, age, id);
    }
    public void flee(int fleeM) {
        if (fleeM>500)
        System.out.printf("Собака %d метров не пробежит%n", fleeM);
      }
      public void swim(int swimM) {
        if(swimM>0)
      System.out.printf("Cобака проплывет только 10 метров, но не %d%n ", swimM);
    }
    }