package Jul13;

// String is defined as array of characters.

public class charAt {
    public static void main(String[] args) {
        // charAt - This method returns the character located at the String's specified index.

        // Make a Character array
        char[] arr = {'a','b','c'};
        // Make a String
        String abc = "abc";

        // how different between String and character Array.
        System.out.println(arr[1]); // It is the same method with Integer array.
        System.out.println(abc.charAt(1));  // charAt function is used for finding specific index of String.
    }
}
