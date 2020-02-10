public class Cat {
    public String name;
    public int appetite;
    public boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        if (appetite <= 0) {
            satiety = true;
        } else {
            satiety = false;
        }
    }

    public void eat(Plate p1) {
        p1.decreaseFood(name, appetite, satiety);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " Koт '" + name + '\'' + ", Апетит='" + appetite + '\'' + ", Сытость='"
                + satiety + '\'';
    }
    public String getTextInfo() {
        return "Имя " + name + "; Aпетит " + appetite + "; Cытость " + satiety;
    }
}