import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Alessandro Arosio - 03/10/2020 16:38
 */
public class ArrayReverser {
    public static void main(String[] args) {
        String[] stringList = new String[]{"I", "like", "hacktoberfest", "2020"};
        System.out.println(Arrays.toString(reverseArrayWithJavaStreams(stringList)));

        System.out.println(Arrays.toString(reverseUsingCollectionsMethod(stringList)));
    }

    private static Object[] reverseArrayWithJavaStreams(Object[] array) {
        return IntStream.rangeClosed(1, array.length)
                .mapToObj(i -> array[array.length - i])
                .toArray();
    }

    private static Object[] reverseUsingCollectionsMethod(Object[] objects) {
        Collections.reverse(Arrays.asList(objects));
        return objects;
    }
}
