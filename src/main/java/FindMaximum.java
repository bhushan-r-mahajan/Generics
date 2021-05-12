import java.util.Arrays;
import java.util.Collections;

@SuppressWarnings("ALL")
public class FindMaximum<Z extends Comparable> {
    Z x, y, z;

    public FindMaximum() {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static <Z extends Comparable<Z>> Z pritnMultiple(Z[] input) {
        Z max = Collections.max(Arrays.asList(input));
        System.out.println("**** The Max Element From given array is: " + max + " ****");
        return max;
    }

    public static <Z extends Comparable<Z>> Z printMax(Z x, Z y, Z z) {
        Z max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println("<--- The Maximum Element is: " + max + " --->");
        return max;
    }

    public Z testMaximum(Z x, Z y, Z z) {
        Z max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println("#### The Maximum element found using Generic class is: " + max + " ####");
        return max;
    }
}
