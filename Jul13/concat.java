package Jul13;

// String is defined as array of characters.

public class concat {
    public static void main(String[] args) {
        // concat - This method returns a string with the value of the string passed into the method,
        // appended to the end of the string.

        String firstName = "Muhyun ";
        String lastName = "Kim. ";
        String fullName = firstName + lastName;

        // These are the same method for printing full name.
        System.out.println(firstName + lastName);
        System.out.println(fullName);
        System.out.println(firstName.concat(lastName));
        System.out.println("Muhyun ".concat(lastName));


        // String firstName is defined as array so you can use for-loop function like Integer.
        // Tip: Make sure use () at the end of length
        for (int i = 0; i < firstName.concat(lastName).length(); i++) {
            System.out.print(firstName.concat(lastName).charAt(i));
        }
    }
}
