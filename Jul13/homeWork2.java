package Jul13;

import java.util.Scanner;

public class homeWork2 {
    /*
      2) Split the given string in half and return a string with the halves in reverse order.
          input: "12345678"
          output: "56781234"

          input: "12345"
          output: "34512" or "45123"
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some numbers");
        // Let user make a string name is input
        String numbers = sc.nextLine();
        // Use hw02 function. Input is String input and Output is String output
        System.out.println(hw02(numbers));

    }
    // Function that split the given string in half and return a string with the halves in reverse order.
    public static String hw02(String numbers) {
        // split the given string in half.
        String output1 = numbers.substring(0,numbers.length()/2);
        // split the given string in half
        String output2 = numbers.substring(numbers.length()/2,numbers.length());
        // Make a string with halves in reverse order.
        String output = output2 + output1;
        return output;
    }
}