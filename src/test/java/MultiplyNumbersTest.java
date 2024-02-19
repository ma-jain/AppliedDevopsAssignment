import org.example.MultiplyTwoNumbers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplyNumbersTest {

    @Test
    public void testMultiplication() {
        MultiplyTwoNumbers multiplyTwoNumbers=new MultiplyTwoNumbers();
        int product = multiplyTwoNumbers.multiply(4, 3);
        Assert.assertEquals(product, 12, "Product should be 12");
    }

    @Test
    public void testMultiplicationWithZero() {
        MultiplyTwoNumbers multiplyTwoNumbers=new MultiplyTwoNumbers();
        int product = multiplyTwoNumbers.multiply(7, 0);
        Assert.assertEquals(product, 0, "Product should be 0");
    }
}
