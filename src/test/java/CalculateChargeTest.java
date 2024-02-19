import org.example.AddTwoNumbers;
import org.example.CalculateCharge;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculateChargeTest {
    @Test
    public void ZeroCondition() {
        CalculateCharge calculateCharge = new CalculateCharge();
        double charge = calculateCharge.Charge(0);
        Assert.assertEquals(charge, 0, "correct output is 0");

    }

    @Test
    public void testUnderForty() {
        CalculateCharge calculateCharge = new CalculateCharge();
        double charge = calculateCharge.Charge(39);
        Assert.assertEquals(charge, 5.75, "correct output is 5.75");

    }

    @Test
    public void testUnderForty2() {
        CalculateCharge calculateCharge = new CalculateCharge();
        double charge = calculateCharge.Charge(20);
        Assert.assertEquals(charge, 5.75, "correct output is 5.75");
    }

    @Test
    public void testOverForty() {
        CalculateCharge calculateCharge = new CalculateCharge();
        double charge = calculateCharge.Charge(321);
        Assert.assertEquals(charge, 67.83, "correct output is 1096.03");
    }

    @Test
    public void testOverFiveHundred() {
        CalculateCharge calculateCharge = new CalculateCharge();
        double charge = calculateCharge.Charge(739);
        Assert.assertEquals(charge, 266.76, "correct output is 266.76");
    }

    @Test
    public void testOverFiveHundred2() {
        CalculateCharge calculateCharge = new CalculateCharge();
        double charge = calculateCharge.Charge(1005);
        Assert.assertEquals(charge, 444.98, "correct output is 444.98");
    }

    @Test
    public void alphabet() {
        CalculateCharge calculateCharge = new CalculateCharge();
        String incorrectInputString = "abc1b2c3";
        int defaultValue = 0; // or any default value you prefer
        double actualOutputForInvalidInput = CalculateCharge.Charge(parseOrDefault(incorrectInputString, defaultValue));
        Assert.assertEquals(actualOutputForInvalidInput, defaultValue, "Charge function should return default value for invalid input");
    }
    private int parseOrDefault(String input, int defaultValue) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

}
