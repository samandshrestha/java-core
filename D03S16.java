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
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
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
public class D03S16 {
    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>();
        persons.add(new Person(101, "Yamada", 22, 40000));
        persons.add(new Person(102, "ichikawa", 21, 45000));
        persons.add(new Person(103, "izumi", 24, 80000));
        persons.add(new Person(104, "luffy", 21, 89000));
        persons.add(new Person(105, "zoro", 25, 90000));
        persons.add(new Person(106, "kyoko", 20, 990000));
        System.out.println("Details of each person:");
        for (Person person : persons) {
            System.out.println(person.getId() + "\t" + person.getName() + "\t" + person.getSalary());
        }
    }
}
