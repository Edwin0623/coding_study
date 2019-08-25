package Z_PortFolio;

import java.util.Scanner;

public class portFolio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello. " + get_name() + "\n");
        System.out.println("Enter an number you want to do on the list below." + "\n");

        while (true) {
            get_menu();
            System.out.print("Select number: ");
            int num = sc.nextInt();
            if (num == 999) {
                System.out.println("Exit the Program.");
                break;
            } else {
                System.out.println();
                execute(num);
                System.out.println();
            }
        }
    }
    public static String get_name() {
        return "Muhyun!";
    }
    public static void get_menu() {
        System.out.println("0) Show Menu.");
        System.out.println("1) Make 1 ~ n left side half diamond.");
        System.out.println("2) Make 1 ~ n right side half diamond.");
        System.out.println("3) Make Star triangle.");
        System.out.println("4) Make n ~ 1 left side half diamond.");
        System.out.println("5) Make Star ribbon.");
        System.out.println("6) Make Star diamond.");
        System.out.println("7) Find Max and Min Integer.");
        System.out.println("8) Find the Missing Number.");
        System.out.println("9) Find Max sum given numbers.");
        System.out.println("10) Find Max sum given numbers. (NO-GA-DA ver)");
        System.out.println("11) Find some indexes with an array user made.");
        System.out.println("12) Reverse a given String.");
        System.out.println("13) Split the given string in half and return a string with the halves in reverse order.");
        System.out.println("14) Given a string, print all characters in odd index in order.");
        System.out.println("15) Given two strings, return true if two strings are equal. (ignore case)");
        System.out.println("16) Given a list of names, return the third name.");
        System.out.println("17) Given a string, return the string without the last character.");
        System.out.println("18) Given a noun, return the plural form of the noun. (by adding 's' or 'es')");
        System.out.println("19) Given a verb, return the past tense of the verb. (by adding 'ed')");
        System.out.println("20) Given a word, return the number of vowels.");
        System.out.println("21) Given a word with even length, split the word in half and insert ' & ' in-between.");
        System.out.println("22) Given a sentence, return total number of words in the sentence.");
        System.out.println("23) Given a sentence, return a sentence with all the words in reverse order.");
        System.out.println("999) Exit the program. Bye " + get_name());
        System.out.println();
    }

    public static void execute(int num) {
        Scanner sc = new Scanner(System.in);
        if (num >= 0 && num <= 23) {
            if (num == 0) {
                System.out.println(">>Show menu");
            } else if (num == 1) {
                System.out.println(">>Show Homework 01" + "\n");
                while (true) {
                    System.out.print("Enter an positive Integer. If not exit this Homework: ");
                    int n = sc.nextInt();
                    if (n < 1) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw01(n);
                    }
                }
            } else if (num == 2) {
                System.out.println(">>Show Homework 02" + "\n");
                while (true) {
                    System.out.print("Enter an positive Integer. If not exit this Homework: ");
                    int n = sc.nextInt();
                    if (n < 1) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw02(n);
                    }
                }
            } else if (num == 3) {
                System.out.println(">>Show Homework 03" + "\n");
                while (true) {
                    System.out.print("Enter an positive Integer. If not exit this Homework: ");
                    int n = sc.nextInt();
                    if (n < 1) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw03(n);
                    }
                }
            } else if (num == 4) {
                System.out.println(">>Show Homework 04" + "\n");
                while (true) {
                    System.out.print("Enter an positive Integer. If not exit this Homework: ");
                    int n = sc.nextInt();
                    if (n < 1) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw04(n);
                    }
                }
            } else if (num == 5) {
                System.out.println(">>Show Homework 05" + "\n");
                while (true) {
                    System.out.print("Enter an positive Integer. If not exit this Homework: ");
                    int n = sc.nextInt();
                    if (n < 1) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw05(n);
                    }
                }
            } else if (num == 6) {
                System.out.println(">>Show Homework 06" + "\n");
                while (true) {
                    System.out.print("Enter an positive Integer. If not exit this Homework: ");
                    int n = sc.nextInt();
                    if (n < 1) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw06(n);
                    }
                }
            } else if (num == 7) {
                System.out.println(">> 7) Find Max and Min Integer." + "\n");
                while (true) {
                    System.out.print("Enter an positive Integer. If not exit this Homework: ");
                    int n = sc.nextInt();
                    if (n < 1) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw07(n);
                    }
                }
            } else if (num == 8) {
                System.out.println(">> 8) Find the Missing number." + "\n");
                while (true) {
                    System.out.print("Enter an positive Integer. If not exit this Homework: ");
                    int n = sc.nextInt();
                    if (n < 1) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw08(n);
                    }
                }
            } else if (num == 9) {
                System.out.println(">> 9) Find Max sum given number." + "\n");
                while (true) {
                    System.out.print("Enter an positive Integer. If not exit this Homework: ");
                    int n = sc.nextInt();
                    if (n < 1) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw09(n);
                    }
                }
            } else if (num == 10) {
                System.out.println(">> 10) Find Max sum given number (NO-GA-DA ver)" + "\n");
                while (true) {
                    System.out.print("Enter an positive Integer. If not exit this Homework: ");
                    int n = sc.nextInt();
                    if (n < 1) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw10(n);
                    }
                }
            } else if (num == 11) {
                System.out.println(">> 11) Find the index with an array user made." + "\n");
                while (true) {
                    System.out.print("Enter an positive Integer. If not exit this Homework: ");
                    int n = sc.nextInt();
                    if (n < 1) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw11(n);
                    }
                }
            } else if (num == 12) {
                System.out.println(">> 12) Reverse a given String." + "\n");
                while (true) {
                    System.out.println("Type an word and this program will show you an reversed word until typing 'exit'. ");
                    String word = sc.nextLine();
                    String exit = "exit";
                    if (word.equalsIgnoreCase("Exit") == true) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw12(word);
                    }
                }
            } else if (num == 13) {
                System.out.println(">> 13) Split the given string in half and return a string with the halves in reverse order." + "\n");
                while (true) {
                    System.out.println("Type some numbers and this program will show you a string with the halves in revers order" +
                            " until typing 'exit'. ");
                    String str = sc.nextLine();
                    String exit = "exit";
                    if (str.equalsIgnoreCase("Exit") == true) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw13(str);
                    }
                }
            } else if (num == 14) {
                System.out.println(">> 14) given a string, print all characters in odd index in order." + "\n");
                while (true) {
                    System.out.println("Type some words and this program will print all characters in odd index in order" +
                            " until typing 'exit'. ");
                    String str = sc.nextLine();
                    String exit = "exit";
                    if (str.equalsIgnoreCase("Exit") == true) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw14(str);
                    }
                }
            } else if (num == 15) {
                System.out.println(">> 15) Given two strings, return true if two strings are equal.(ignore case)" + "\n");
                while (true) {
                    System.out.println("Type string(1/2), this program will return true if two strings are equal" +
                            " until typing 'exit'. ");
                    String str = sc.nextLine();
                    String exit = "exit";
                    if (str.equalsIgnoreCase("Exit") == true) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw15(str);
                    }
                }
            } else if (num == 16) {
                System.out.println(">> 16) Given a list of names, return the third name." + "\n");
                while (true) {
                    System.out.println("How many names you want to put in a list?");
                    int n = sc.nextInt();
                    if (n < 1) {
                        System.out.println("Sorry, you must put greater than 3. Exit homework.");
                        break;
                    } else {
                        hw16(n);
                    }
                }
            } else if (num == 17) {
                System.out.println(">> 17) Given a string, return the string without the last character." + "\n");
                while (true) {
                    System.out.println("Type a string, this program will return the string without the last character" +
                            " until typing 'exit'. ");
                    String str = sc.nextLine();
                    String exit = "exit";
                    if (str.equalsIgnoreCase("Exit") == true) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw17(str);
                    }
                }
            } else if (num == 18) {
                System.out.println(">> 18) Given a noun, return the plural form of the noun. (by adding 's' or 'es')" + "\n");
                while (true) {
                    System.out.println("Type a noun, this program will return the plural form of the noun" +
                            " until typing 'exit'. ");
                    String str = sc.nextLine();
                    String exit = "exit";
                    if (str.equalsIgnoreCase("EXIT") == true) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw18(str);
                    }
                }
            } else if (num == 19) {
                System.out.println(">> 19) Given a verb, return the past tense of the verb. (by adding 'ed')" + "\n");
                while (true) {
                    System.out.println("Type a verb, this program will return the past tense of the verb" +
                            " until typing 'exit'. ");
                    String str = sc.nextLine();
                    String exit = "exit";
                    if (str.equalsIgnoreCase("EXIT") == true) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw19(str);
                    }
                }
            } else if (num == 20){
                System.out.println(">> 20) Given a word, return the number of vowels." + "\n");
                while (true) {
                    System.out.println("Type a word, this program will return the number of vowels" +
                            " until typing 'exit'. ");
                    String str = sc.nextLine();
                    String exit = "exit";
                    if (str.equalsIgnoreCase("EXIT") == true) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw20(str);
                    }
                }
            } else if (num == 21){
                System.out.println(">> 21) Given a word with even length, split the word in half and insert ' & ' in-between." + "\n");
                while (true) {
                    System.out.println("Type a word with even length, this program will split the word in half and insert " +
                            "' & ' in-between until typing 'exit'. ");
                    String str = sc.nextLine();
                    String exit = "exit";
                    if (str.equalsIgnoreCase("EXIT") == true) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw21(str);
                    }
                }
            } else if (num == 22){
                System.out.println(">> 22) Given a sentence, return total number of words in the sentence." + "\n");
                while (true) {
                    System.out.println("Type a sentence, this program will return total number of words in the sentence " +
                            "until typing 'exit'. ");
                    String str = sc.nextLine();
                    String exit = "exit";
                    if (str.equalsIgnoreCase("EXIT") == true) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw22(str);
                    }
                }
            } else {
                System.out.println(">> 23) Given a sentence, return a sentence with all the words in reverse order." + "\n");
                while (true) {
                    System.out.println("Type a sentence, this program will return total number of words in the sentence " +
                            "until typing 'exit'. ");
                    String str = sc.nextLine();
                    String exit = "exit";
                    if (str.equalsIgnoreCase("EXIT") == true) {
                        System.out.println("Exit this homework.");
                        break;
                    } else {
                        hw23(str);
                    }
                }
            }
        } else {
            System.out.println(num + " is not exist in Menu.");
        }
    }

    public static void hw01(int n) {
        System.out.println();
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j <= i) {
                System.out.print(j + 1);
                j++;
            }
            System.out.println();
            i++;
        }
        i = 0;
        while (i < n - 1) {
            int j = 0;
            while (j < (n - 1) - i) {
                System.out.print(j + 1);
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }
    public static void hw02(int n) {
        System.out.println();
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < (n - 1) - i) {
                System.out.print(" ");
                j++;
            }
            int k = i + 1;
            while (k > 0) {
                System.out.print(k);
                k--;
            }
            System.out.println();
            i++;
        }
        i = 0;
        while (i < n - 1) {
            int j = 0;
            while (j <= i) {
                System.out.print(" ");
                j++;
            }
            int k = n - 1 - i;
            while (k > 0) {
                System.out.print(k);
                k--;
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }
    public static void hw03(int n) {
        System.out.println();
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < (n - 1) - i) {
                System.out.print(" ");
                j++;
            }
            int k = 0;
            while (k <= (2 * i + 1) - 1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }
    public static void hw04(int n) {
        System.out.println();
        int i = 0;
        while (i < n) {
            int j = n - i;
            while (j > 0) {
                System.out.print(j);
                j--;
            }
            System.out.println();
            i++;
        }
        i = 0;
        while (i < n - 1) {
            int j = i + 2;
            while (j > 0) {
                System.out.print(j);
                j--;
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }
    public static void hw05(int n) {
        System.out.println();
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < i) {
                System.out.print(" ");
                j++;
            }
            int k = n - i;
            while (k > 0) {
                System.out.print("*");
                k--;
            }
            System.out.println();
            i++;
        }
        i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                System.out.print(" ");
                j++;
            }
            int k = 0;
            while (k <= i) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }
    public static void hw06(int n) {
        System.out.println();
        int i = 0;
        while (i < n) {
            int j = (n - 1) - i;
            while (j > 0) {
                System.out.print(" ");
                j--;
            }
            int k = 0;
            while (k < 2 * (i + 1) - 1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
        i = 0;
        while (i < n - 1) {
            int j = 0;
            while (j <= i) {
                System.out.print(" ");
                j++;
            }
            int k = 0;
            while (k < 2 * (n - 1 - i) - 1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }
    public static void hw07(int n) {
        Scanner sc = new Scanner(System.in);
        // 최대, 최소값을 처음에 0으로 지정한다.
        int max_Integer = 0;
        int min_Integer = 0;
        int i = 1;
        while (i <= n) {
            System.out.print("Enter an Integer for(" + i + "/" + n + "): ");
            int Input_Integer = sc.nextInt();
            /*
               0보다 큰 값만 입력할 경우 최소값이 0, 0보다 작은 값만 입력할 경우 최대값이 0 이 되기때문에 내가 입력한 범위 안에서 비교하기 해야한다.
               따라서 처음 입력한 값을 최대값과 최소값으로 바꿔준다. 그러면 입력한 범위 안에서 비교가 가능하고 1번만 입력할 경우에 최대, 최소 값은
               처음에 입력한 값이 되므로 최대, 최소값이 0이 되는 것을 막을 수 있다.
            */
            if (i == 1) {
                max_Integer = Input_Integer;
                min_Integer = Input_Integer;
            }
            if (max_Integer < Input_Integer) {
                max_Integer = Input_Integer;
            }
            if (Input_Integer < min_Integer) {
                min_Integer = Input_Integer;
            }
            i++;
        }
        System.out.println();
        System.out.println("Max Integer: " + max_Integer + "\t" + "Min Integer: " + min_Integer);
        System.out.println();
    }
    public static void hw08(int n) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int sum1 = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        int i = 1;
        while (i <= n - 1) {
            System.out.print("Enter an positive Integer for (" + i + "/" + (n - 1) + "): ");
            int nn = sc.nextInt();
            sum1 = sum1 + nn;
            i++;
        }
        System.out.println("Missing number is: " + (sum - sum1));
        System.out.println();
    }
    public static void hw09(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("You need to make an array!");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("-> Input components by typing Integer for array[" + i + "] = ");
            int arrIndex = sc.nextInt();
            arr[i] = arrIndex;
        }
        System.out.print("array = {");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length - 1] + "}" + "\n");
        System.out.println("Find Max sum of 연속된 숫자의 합");
        int tempSum = arr[0];
        int finSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (tempSum + arr[i] < arr[i]) {
                tempSum = arr[i];
            } else {
                tempSum = tempSum + arr[i];
            }
            if (finSum < tempSum) {
                finSum = tempSum;
            }
        }
        System.out.println("Max sum: " + finSum);
        System.out.println();
    }
    public static void hw10(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("You need to make an array!");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("-> Input components by typing Integers for array[" + i + "] = ");
            int arrIndex = sc.nextInt();
            arr[i] = arrIndex;
        }
        System.out.print("array = {");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length - 1] + "}" + "\n");
        System.out.println("Find max sum of 연속된 숫자의 합");
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                System.out.println("Sum (arr[" + i + "] ~ arr[" + j + "]) = " + sum);
            }
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println("Max sum: " + max);
    }
    public static void hw11(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("You need to make an array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("-> Input components by typing Integers for array[" + i + "] = ");
            int N = sc.nextInt();
            arr[i] = N;
        }
        System.out.println("Show the array you made.");
        System.out.print("array = {");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length - 1] + "}");
        System.out.print("Enter an positive Integer you want to try to find components of array: ");
        int y = sc.nextInt();
        for (int i = 1; i <= y; i++) {
            System.out.print("Enter an positive for(" + i + "/" + y + ") = ");
            int Y = sc.nextInt();
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (Y == arr[j]) {
                    found = true;
                }
            }
            if (found) {
                System.out.println("-> This value exists in the array.");
            } else {
                System.out.println("-> This value does not exist in the array.");
            }
        }
        System.out.println("Finished to find." + "\n");
    }
    public static void hw12(String word) {
        System.out.println(reverse(word));
        System.out.println();
    }
    public static String reverse(String word) {
        String reversed_word = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed_word = reversed_word.concat(Character.toString(word.charAt(i)));
        }
        return reversed_word;
    }
    public static void hw13(String str) {
        // Let user make a string name is input
        // Use hw02 function. Input is String str and Output is String output
        System.out.println(split(str));
        System.out.println();
    }
    // Function that split the given string in half and return a string with the halves in reverse order.
    public static String split(String str) {
        // split the given string in half.
        String output1 = str.substring(0, str.length() / 2);
        // split the given string in half
        String output2 = str.substring(str.length() / 2, str.length());
        // Make a string with halves in reverse order.
        String output = output2 + output1;
        return output;
    }
    public static void hw14(String str) {
        /*
           3) given a string, print all characters in odd index in order.
           input: "abcdefg"
           output: "bdf"
         */
        System.out.println(odd_words(str));
        System.out.println();
    }
    public static String odd_words(String str) {
        // This string is the same with ( char[] odd_word = {} )
        String odd_word = "";
        // Use for-loop for printing odd index in order. i = i + 2 is the point.
        for (int i = 1; i < str.length(); i = i + 2) {
            // Use Character.toSting to make 'char' to 'string'
            odd_word = odd_word.concat(Character.toString(str.charAt(i)));
        }
        return odd_word;
    }
    public static void hw15(String str) {
        /*
           4) Given two strings, return true if two strings are equal. (ignore case)
         */
        equals(str);
    }
    public static void equals(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type string(2/2)");
        String str2 = sc.nextLine();
        System.out.println(str.equalsIgnoreCase(str2));
    }
    public static void hw16(int n) {
        Scanner sc = new Scanner(System.in);
        // Make an array size for n
        String nameArr[] = new String[n];
        // Use for-loop to let user input indexes into an empty array name is nameArr
        for (int i = 0; i < n; i++) {
            System.out.println("Type name for(" + (i+1) + "/" + n + ")");
            String name = sc.nextLine();
            nameArr[i] = name;
        }
        System.out.print("The third name you put is: " + "'" + nameArr[2] + "'");
        System.out.println();
    }
    public static void hw17(String str) {
        // Use substring not to print last Character
        System.out.println(str.substring(0,str.length()-1));
    }
    public static void hw18(String str) {
        /*
           7) Given a noun, return the plural form of the noun. (by adding 's' or 'es')
               input: "apple"
               output: "apples"

               input: "potato"
               output: "potatoes"
         */
        plural_form(str);
    }
    public static void plural_form(String str) {
        // use '==' because '' is used for char   // fish
        if (str.charAt(str.length() - 1) == 's') {
            str = str.concat("es");
        } else if (str.charAt((str.length() - 1)) == 'h' && (str.equalsIgnoreCase("fish")) == false) {
            str = str.concat("es");
        } else if (str.charAt(str.length() - 1) == 'o') {
            str = str.concat("es");
        } else if (str.charAt(str.length() - 1) == 'y') {
            str = str.substring(0,str.length() - 1).concat("ies");
        } else if (str.charAt(str.length()-1) == 'f') {
            str = str.substring(0,str.length()-1).concat("ves");
        } else if (str.charAt(str.length() - 1) == 'x') {
            str = str.concat("es");
        } else if (str.charAt(str.length() - 1) == 'z') {
            str = str.concat("es");
        }
        // use equals because "fe" is string
        else if (str.substring(str.length()-2).equals("fe")) {
            str = str.substring(0,2).concat("ves");
        }
        else {
            str = str.concat("s");
        }
        System.out.println(str);
    }
    public static void hw19(String str) {
        past_tense(str);
    }
    public static void past_tense(String str) {
        str = str.concat("ed");
        System.out.println(str);
    }
    public static void hw20(String str) {
        num_of_vowels(str);
    }
    public static void num_of_vowels(String str) {
        char[] vowels = {'a','e','i','o','u'};
        // numOfVowels is used to put into a array found vowels
        String numOfVowels = "";
        // This for-loop is cycled for str.length to find vowels
        for (int i = 0; i < str.length(); i++) {
            // This for-loop is cycled for vowels.length to find vowels and check the same with str's vowels.
            for (int j = 0; j < vowels.length; j++) {
                // If vowels of str and vowels of vowels are the same, put into a numOfVowels found vowels.
                if (str.charAt(i) == vowels[j]) {
                    numOfVowels = numOfVowels.concat(Character.toString(vowels[j]));
                }
            }
        }
        System.out.println("The number of vowels: " + numOfVowels.length());
    }
    public static void hw21(String str) {
        split_insert(str);
    }
    public static void split_insert(String str) {
        // Use % 2 == 0 for check word with even length or not.
        if (str.length() % 2 == 0) {
            str = str.substring(0,str.length()/2).concat(" & " + str.substring(str.length()/2));
            System.out.println(str);
        } else {
            System.out.println("Sorry, this is not an word with even length.");
        }
    }
    public static void hw22(String str) {
        // Split by " " then words are saved in the strArr[]
        String strArr[] = str.split(" ");
        System.out.println("Number of words in the sentence: " + strArr.length);
    }
    public static void hw23(String str) {
        reversed_words(str);
    }
    public static void reversed_words(String str) {
        // Split by " " then words are saved in the strArr[]
        String strArr[] = str.split(" ");
        // Use for-loop to print words in reverse order.
        for (int i = strArr.length - 1; i >= 0; i--) {
            System.out.print(strArr[i] + " ");
        }
        System.out.println();
    }
}



