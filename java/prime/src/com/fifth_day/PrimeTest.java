package com.fifth_day;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by chengwei on 2017/5/3.
 */
public class PrimeTest {
    Prime prime = new Prime();
    @Test
    public void input_2_return_2() {
        assertEquals(Arrays.asList(2), prime.calculate(2));
    }

    @Test
    public void input_3_return_3() {
        assertEquals(Arrays.asList(3), prime.calculate(3));
    }

    @Test
    public void input_4_return_2_2() {
        assertEquals(Arrays.asList(2, 2), prime.calculate(4));
    }
}
