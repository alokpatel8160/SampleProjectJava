package SamplePackage;

public class CallObjectFromSameClass 
{
    private int number = 5;

    // Method to display the number
    public void displayNumber() 
    {
        System.out.println("Number is: " + number);
    }

    // Method to double the number
    public void doubleNumber() 
    {
        number *= 2;
    }
    public static void main(String[] args) 
    {
        // Creating an object of MyClass
    	CallObjectFromSameClass obj1 = new CallObjectFromSameClass();

        // Calling methods on the object
        obj1.displayNumber(); // Output: Number is: 5

        // Calling doubleNumber method on the same object
        obj1.doubleNumber();

        // Calling displayNumber again to see the updated value
        obj1.displayNumber(); // Output: Number is: 10
    }
}