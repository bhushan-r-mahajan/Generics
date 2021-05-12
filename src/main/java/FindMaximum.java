public class FindMaximum {

    public static void printArray(Integer[] input) {
        System.out.println("<--The Integer Values are-->");
        for(int value:input) {
            System.out.println(value);
        }
    }

    public static void printArray(Double[] input) {
        System.out.println("<--The Double Values are-->");
        for(double value:input) {
            System.out.println(value);
        }
    }

    public static void printArray(String[] input) {
        System.out.println("<--The String Values are-->");
        for(String value:input) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] stringArray = {"apple", "banana", "mangoes", "grapes", "watermelon" };

        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);
    }
}
