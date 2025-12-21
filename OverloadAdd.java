public class OverloadAdd {

    // Function 1: Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Function 2: Add (concatenate) two strings
    public String add(String s1, String s2) {
        return s1 + s2;
    }

    public static void main(String[] args) {
        OverloadAdd obj = new OverloadAdd();

        // Test integer addition
        int intResult = obj.add(10, 20);
        System.out.println("Sum of integers: " + intResult);

        // Test string concatenation
        String strResult = obj.add("Hello ", "World");
        System.out.println("Concatenated string: " + strResult);
    }
}
