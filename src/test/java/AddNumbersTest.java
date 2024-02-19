import org.example.AddTwoNumbers;
import org.example.MultiplyTwoNumbers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNumbersTest {

    @Test
    public void testAddition() {
        AddTwoNumbers addTwoNumbers=new AddTwoNumbers();
        int sum = addTwoNumbers.add(3, 5);
        Assert.assertEquals(sum, 8, "Sum should be 8");
    }

    @Test
    public void testAdditionWithZero() {
        AddTwoNumbers addTwoNumbers=new AddTwoNumbers();
        int sum = addTwoNumbers.add(10, 0);
        Assert.assertEquals(sum, 10, "Sum should be 10");
    }
}
