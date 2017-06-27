package com.second_day;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by chengwei on 2017/4/27.
 */
public class PrimeTest {
    Prime prime;
    public PrimeTest() {
        prime = new Prime();
    }

    @Test
    public void input_2_return_2() {
        assertEquals(Arrays.asList(2), prime.calculator(2));
    }

    @Test
    public void input_4_return_2_2() {
        assertEquals(Arrays.asList(2, 2), prime.calculator(4));
    }

    @Test
    public void input_6_return_2_3() {
        assertEquals(Arrays.asList(2, 3), prime.calculator(6));
    }

    @Test
    public void input_8_return_2_2_2() {
        assertEquals(Arrays.asList(2, 2, 2), prime.calculator(8));
    }

    @Test
    public void input_9_return_3_3() {
        assertEquals(Arrays.asList(3, 3), prime.calculator(9));
    }

    @Test
    public void input_12_return_2_2_3() {
        assertEquals(Arrays.asList(2, 2, 3), prime.calculator(12));
    }
}
