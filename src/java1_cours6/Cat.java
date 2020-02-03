
public class Cat extends Animal {
    public Cat(String name, String color, int age, int id) {
    super(name, color, age, id);
    }
    
    public void flee(int fleeM) {
        if (fleeM>200)
        System.out.printf("Кот не пробежит %d%n", fleeM);
      }
      public void swim(int swimM) {
          if(swimM>0)
        System.out.printf("Кот плавать не умеет %n");
      }
    }