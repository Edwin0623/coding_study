package Jul13;

// String is defined as array of characters.

public class arrayOfcharAndInt {
    public static void main(String[] args) {

        // Make a Character array and an Integer array
        char[] charArr = {'a','b','c'};
        int[] intArr = {1,2,3};

        // Fine an index you want to see
        System.out.println(charArr[1]);
        System.out.println(intArr[1]);

        // < length vs length() >
        // 1) Size of Array - length
        System.out.println(charArr.length);
        System.out.println(intArr.length);

        // 2) Size of String - length()
        String abc = "abc";
        System.out.println(abc.length());
    }
}

