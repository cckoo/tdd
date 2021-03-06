package com.second_day;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chengwei on 2017/4/27.
 */
public class Prime {
    private static final int PRIME_NUM = 2;
    public List<Integer> calculator(int num) {
        List<Integer> primes = new ArrayList<>();

        for (int i = PRIME_NUM; num > 1; i++)
            for (; num % i == 0; num /= i)
                primes.add(i);

        return primes;
    }
}
