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
public class D03S19 {
    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>();
        persons.add(new Person(1, "Izumi", 21, 10000));
        persons.add(new Person(2, "Ichikawa", 22, 20000));
        persons.add(new Person(3, "Jhon Libert", 23, 30000));
        persons.add(new Person(4, "Luffy", 24, 40000));
        persons.add(new Person(5, "Zoro", 25, 50000));
        System.out.println("First Person whose name starts with J:");
        for (Person person : persons) {
            if (person.getName().startsWith("J")) {
                System.out.println(person);
                break;
            }
        }
    }
}
