import com.torryharris.Testing.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(6,calculator.add(2,4));
    }

    @Test
    public void subTest(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(1,calculator.sub(2,3));
    }
    @Test
    public void mulTest(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(6,calculator.mul(2,3));
    }
    @Test
    public void divTest(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(2,calculator.div(16,8));
    }
}
