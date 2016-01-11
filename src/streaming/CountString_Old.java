package streaming;

public class CountString_Old {

    public static void main(String[] args) {
        String[] strs = new String[] { "a", null, "b", "c", null, "d" };
        int numNonNull = 0;
        for (String str : strs) {
            if (str != null) {
                numNonNull += 1;
            }
        }
        System.out.println("The number of non-null string is: " + numNonNull);
    }
}
