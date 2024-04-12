package SamplePackage;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to create a new person object with a specified name and age
    public void createYoungerPerson() {
        int youngerAge = age - 5; // Creating a younger age based on current age
        Person youngerPerson = new Person("Younger " + name, youngerAge);
        youngerPerson.introduce(); // Calling introduce method of the new object
    }

    // Method to introduce the person
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        person1.introduce(); // Output: Hello, my name is Alice and I am 30 years old.

        // Calling createYoungerPerson method
        person1.createYoungerPerson(); // Output: Hello, my name is Younger Alice and I am 25 years old.
    }
}