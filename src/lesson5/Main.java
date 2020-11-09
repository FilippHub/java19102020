package lesson5;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", "red", 2);
        Dog dog = new Dog("Tuzik", "white", 3);
        Duck duck = new Duck("Donald", "red", 15);

        Animal[] animals = {
                new Cat("Barsik", "red", 2),
                new Dog("Tuzik", "white", 3),
                new Duck("Donald", "red", 15),
                new WildCat("Tigr", "red-black", 7),
                new Dog("Vulkan", "white", 6)
        };

        for (int i = 0; i < animals.length; i++) {

            System.out.println(animals[i].toString());
        }

    }
}
