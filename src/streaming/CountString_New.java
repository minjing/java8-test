package streaming;

import java.util.stream.Stream;

public class CountString_New {

    public static void main(String[] args) {
        String[] strs = new String[] { "a", null, "b", "c", null, "d" };
        long numNonNull = Stream.of(strs).filter(str -> str != null).count();
        System.out.println("The number of non-null string is: " + numNonNull);
    }

}
