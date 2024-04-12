package SamplePackage;

public class StringBufferDemo 
{
    public static void main(String[] args) {
        // Using String
        String str = "Hello";
        str += " World"; // Concatenating strings creates a new object
        System.out.println("String: " + str);

        // Using StringBuffer
        StringBuffer ABC = new StringBuffer("Hello");
        ABC.append(" World"); // Modifies the existing object
        System.out.println("StringBuffer: " + ABC);
        
        
        Float f1 = new Float("3.0");
        int x = f1.intValue();
        byte b = f1.byteValue();
        double d = f1.doubleValue();
        System.out.println(x + b + d);
        
        
    }
}
