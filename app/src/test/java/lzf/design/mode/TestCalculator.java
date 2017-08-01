package lzf.design.mode;

import org.junit.Assert;
import org.junit.Test;

import lzf.design.mode.junit.Calculator;

/**
 * Created by Administrator on 2017/6/6 0006.
 */
public class TestCalculator {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = Calculator.add(1, 2);
        Assert.assertEquals(3, result, 0);
    }
    @Test
    public void testAdd2() {
        Calculator calculator = new Calculator();
        double result = Calculator.add(1, 5);
        Assert.assertEquals(6, result, 0);
    }
}
