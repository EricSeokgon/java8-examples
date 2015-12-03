package tk.hadeslee.Lambda_Expressions.Designing_with_Lambda_Expreesions;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Project: java8-examples
 * FileName: CalculateNAVTest
 * Date: 2015-11-10
 * Time: 오전 11:03
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CalculateNAVTest {

    @Test
    public void testComputeStockWorth() throws Exception {
        final CalculateNAV calculateNAV =
                new CalculateNAV(ticker -> new BigDecimal("6.01"));

        BigDecimal expected = new BigDecimal("6010.00");
        assertEquals(0,
                calculateNAV.computeStockWorth("Good", 1000).compareTo(expected));
    }
}