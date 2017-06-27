package com.fifth_day;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chengwei on 2017/5/3.
 */
public class Prime {
    public List<Integer> calculate(int num) {
        List<Integer> primes = new ArrayList<>();
        if (num % 2 == 0) {
            primes.add(2);
            num /= 2;
        }
        if (num > 1) {
            primes.add(num);
        }
        return primes;
    }
}
