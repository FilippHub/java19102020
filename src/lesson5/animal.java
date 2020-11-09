package lesson5;

public class animal {
    String name;
    String color;
    int age;

    public Animal() {
    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void jump() {
        System.out.println(name + " jump!");
    }

    public void info() {
        System.out.printf("%s %s %d\n", name, color, age);
    }

    public final void sleep() {
        System.out.println(name + " sleep...");
    }

    public abstract void voice();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
