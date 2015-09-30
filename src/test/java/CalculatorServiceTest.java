import org.junit.Test;
import static org.assertj.core.api.Assertions.*;


/**
 * Project: java8-examples
 * FileName: CalculatorServiceTest
 * Date: 2015-09-30
 * Time: 오후 1:37
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CalculatorServiceTest {

    @Test
    public void testCalculateAddition() throws Exception {
        CalculatorService calculatorService = new CalculatorService();

        final int actual = calculatorService.calculate('+', 1, 1);

        assertThat(actual).isEqualTo(2);
    }

    @Test
    public void testCalculateSubtraction() throws Exception {
        CalculatorService calculatorService = new CalculatorService();

        final int actual = calculatorService.calculate('-', 1, 1);

        assertThat(actual).isEqualTo(0);
    }

    @Test
    public void testCalculateMultiplication() throws Exception {
        CalculatorService calculatorService = new CalculatorService();

        final int actual = calculatorService.calculate('*', 1, 1);

        assertThat(actual).isEqualTo(1);
    }

    @Test
    public void testCalculateDivision() throws Exception {
        CalculatorService calculatorService = new CalculatorService();

        final int actual = calculatorService.calculate('/', 8, 4);

        assertThat(actual).isEqualTo(2);
    }

}