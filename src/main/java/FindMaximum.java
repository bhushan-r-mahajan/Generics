public class FindMaximum {

    public static Integer printMaxInteger(Integer x, Integer y, Integer z) {
        Integer max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println("<---The Maximum Element is: " + max + " --->");
        return max;
    }

    public static Double printMaxDouble(Double x, Double y, Double z) {
        Double max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println("<---The Maximum Element is: " + max + " --->");
        return max;
    }

    public static String printMaxString(String x, String y, String z) {
        String max = x;
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
