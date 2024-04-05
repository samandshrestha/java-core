package day3session1;

import java.util.TreeSet;
class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;
    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }
    @Override
    public int hashCode() {
        return id;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return id == other.id;
    }
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }
}
public class D03S15 {
    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>();
        persons.add(new Person(101, "luffy", 30, 50000));
        persons.add(new Person(102, "zoro", 25, 45000));
        persons.add(new Person(103, "ichikawa", 35, 60000));
        persons.add(new Person(104, "kyoko", 28, 55000));
        persons.add(new Person(105, "yamada", 22, 40000));
        persons.add(new Person(106, "asta", 40, 70000));
        System.out.println("age greater than 25:");
        for (Person person : persons) {
            if (person.getAge() > 25) {
                System.out.println(person);
            }
        }
    }
}
