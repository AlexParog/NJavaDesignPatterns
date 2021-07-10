package com.company;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random = new Random();
    protected int min;
    protected int max;
    protected int number;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        number = min + random.nextInt(max - min + 1);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return min + random.nextInt(max - min + 1);
            }
        };
    }
}
