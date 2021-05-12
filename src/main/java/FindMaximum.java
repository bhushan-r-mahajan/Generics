public class FindMaximum {

    public static <Z extends Comparable<Z>> Z printMax(Z x, Z y, Z z) {
        Z max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println("<---The Maximum Element is: " + max + " --->");
        return max;
    }
}
