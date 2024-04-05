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
public class D03S18 {
    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>();
        persons.add(new Person(101, "izumi", 21, 10000));
        persons.add(new Person(102, "kyoko", 22, 15000));
        persons.add(new Person(103, "hikigaya", 23, 20000));
        persons.add(new Person(104, "yukino", 24, 25000));
        persons.add(new Person(105, "yamada", 25, 30000));
        persons.add(new Person(106, "ichikawa", 26, 35000));
        double totalSalary = 0;
        for (Person person : persons) {
            totalSalary += person.getSalary();
        }
        System.out.println(totalSalary);
    }
}
