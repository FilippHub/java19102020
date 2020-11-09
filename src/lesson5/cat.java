package lesson5;

public class cat {
    int liveCount;
    double talonsLength;

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    public Cat(String name, String color, int age, int liveCount, double talonsLength) {
        super(name, color, age);
        this.liveCount = liveCount;
        this.talonsLength = talonsLength;
    }

    @Override
    public void voice() {
        System.out.println(name + " meow");
    }

    public void findMouse() {
        System.out.println(name + " find Mouse");
    }

    @Override
    public String toString() {
        return "Cat{" +
                " name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", liveCount=" + liveCount +
                ", talonsLength=" + talonsLength +
                '}';
    }
}
