import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaximumTest {
    @Test
    void givenIntegerValueTestMaxInFirstPlace() {
        FindMaximum m = new FindMaximum();
        Integer result = m.printMaxInteger(20,11,7);
        Assertions.assertEquals( 20, result);
    }

    @Test
    void givenIntegerValueTestMaxInSecondPlace() {
        FindMaximum m = new FindMaximum();
        Integer result = m.printMaxInteger(2,11,7);
        Assertions.assertEquals( 11, result);
    }

    @Test
    void givenIntegerValueTestMaxInThirdPlace() {
        FindMaximum m = new FindMaximum();
        Integer result = m.printMaxInteger(2,11,17);
        Assertions.assertEquals( 17, result);
    }

    @Test
    void givenDoubleValueTestMaxInFirstPlace() {
        FindMaximum m = new FindMaximum();
        Double result = m.printMaxDouble(20.25,11.95,7.32);
        Assertions.assertEquals( 20.25, result);
    }

    @Test
    void givenDoubleValueTestMaxInSecondPlace() {
        FindMaximum m = new FindMaximum();
        Double result = m.printMaxDouble(2.3,11.77,7.33);
        Assertions.assertEquals( 11.77, result);
    }

    @Test
    void givenDoubleValueTestMaxInThirdPlace() {
        FindMaximum m = new FindMaximum();
        Double result = m.printMaxDouble(2.55,11.33,17.99);
        Assertions.assertEquals( 17.99, result);
    }

    @Test
    void givenStringValueTestMaxInFirstPlace() {
        FindMaximum m = new FindMaximum();
        String result = m.printMaxString("watermelon","banana","apple");
        Assertions.assertEquals( "watermelon", result);
    }

    @Test
    void givenStringValueTestMaxInSecondPlace() {
        FindMaximum m = new FindMaximum();
        String result = m.printMaxString("apple","watermelon","banana");
        Assertions.assertEquals( "watermelon", result);
    }

    @Test
    void givenStringValueTestMaxInThirdPlace() {
        FindMaximum m = new FindMaximum();
        String result = m.printMaxString("apple","banana","watermelon");
        Assertions.assertEquals( "watermelon", result);
    }
}
