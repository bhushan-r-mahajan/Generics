public class FindMaximum {

    public static <Z> void  printArray(Z[] input) {
        System.out.println("<--The Values in Array are-->");
        for(Z value : input) {
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
