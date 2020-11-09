package lesson5;

public class duck {
    public Duck(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println(name +" krya");
    }
}
