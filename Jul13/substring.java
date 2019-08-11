package Jul13;

// String is defined as array of characters.

public class substring {
    public static void main(String[] args) {
        // substring - A substring is a contiguous sequence of characters within a string
        // : (int beginIndex, int endIndex: not including)

        String model = "iPHONE6";
        System.out.println(model.substring(0,6));
        System.out.println(model.substring(0,6).concat("7"));
        System.out.println(model.substring(1));
    }
}
