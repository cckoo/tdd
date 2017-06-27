package com.first_day;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by chengwei on 2017/4/26.
 */
public class PrimeTest{
    private Prime prime;
    public PrimeTest() {
        prime = new Prime();
    }

    @Test
    public void input_2_return_2() {
        assertArrayEquals(new Integer[]{2}, prime.calculate(2));
    }

    @Test
    public void input_3_return_3() {
        assertArrayEquals(new Integer[]{3}, prime.calculate(3));
    }

    @Test
    public void input_4_return_2_2() {
        assertArrayEquals(new Integer[]{2, 2}, prime.calculate(4));
    }

    @Test
    public void input_6_return_2_3() {
        assertArrayEquals(new Integer[]{2, 3}, prime.calculate(6));
    }

    @Test
    public void input_8_return_2_2_2() {
        assertArrayEquals(new Integer[]{2, 2, 2}, prime.calculate(8));
    }

    @Test
    public void input_9_return_3_3() {
        assertArrayEquals(new Integer[]{3, 3}, prime.calculate(9));
    }

    @Test
    public void input_10_return_2_5() {
        assertArrayEquals(new Integer[]{2, 5}, prime.calculate(10));
    }
}
