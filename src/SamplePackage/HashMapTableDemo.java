package SamplePackage;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapTableDemo {
    public static void main(String[] args) 
    {
        // Creating a HashMap
        Map<String, String> hashMap = new HashMap<>();

        // Adding key-value pairs to HashMap
        hashMap.put("A", "Apple");
        hashMap.put("C", "Cherry");
        hashMap.put("B", "Banana");
        hashMap.put(null, "Null value");

        // Displaying the HashMap
        System.out.println("HashMap: " + hashMap);

        // Creating a Hashtable
        Map<String, String> hashTable = new Hashtable<>();

        // Adding key-value pairs to Hashtable
        hashTable.put("A", "Ant");
        hashTable.put("C", "Cat");
        hashTable.put("B", "Ball");
        
        // This line will throw NullPointerException
        // hashTable.put(null, "Null value");

        // Displaying the Hashtable
        System.out.println("Hashtable: " + hashTable);
    }
}