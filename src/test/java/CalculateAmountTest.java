import org.junit.Assert;
import org.junit.Test;
import ru.netology.services.CalculateAmount;

public class CalculateAmountTest {

    @Test
    public void Test1() {
        CalculateAmount service = new CalculateAmount();
        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void Test2() {
        CalculateAmount service = new CalculateAmount();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assert.assertEquals(expected, actual);
    }

}

