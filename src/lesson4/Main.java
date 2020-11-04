package lesson4;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("Ivanov Ivan", "courier", "ivanov@person.com", 7775455, 30000, 20);
        persons[1] = new Person("Petrov Vadim", "designer", "petrov@person.com", 7775456, 100000, 31);
        persons[2] = new Person("Sidorov Andew", "developer", "sidorov@person.com", 7775457, 300000, 42);
        persons[3] = new Person("Nikolaev Oleg", "project manager", "nikolaev@person.com", 7775458, 150000, 47);
        persons[4] = new Person("Koshkin Makar", "clerk", "koshkin@person.com", 7775459, 27000, 21);


        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAge()>40){
                persons[i].getFullInfo();
            }
        }
    }
}
public class Person {
    private String fio;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Person(String fio, String position, String email, int phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void getFullInfo() {
        System.out.println("fio:" + fio + ", position: " + position
                + ", email: " + email + ", salary: " + salary + ", age: "
                + age);
    }

    int getAge() {
        return age;
    }
}
