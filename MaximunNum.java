package day13Prob;
import java.util.Arrays;
public class MaximunNum{

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }

    public void sort( int [] sortElements) {
        Arrays.sort(sortElements);
        System.out.println(Arrays.toString(sortElements));
    }

    public static void main(String args[]) {

        System.out.printf("Maximum of %d, %d and %d is %d\n\n", 46, 90, 86, maximum(46, 90, 86));
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 62.45, 56.67, 68.9, maximum(62.45,
                56.67, 68.9));
        System.out.printf("Maximum of %s, %s and %s is %s\n", "Priya", "Premlata", "Pratibha", maximum(
                "Priya", "Premlata", "Pratibha"));
        MaximunNum shorElement=new MaximunNum();

        shorElement.sort(new int [] {15,2,3});

    }





}
