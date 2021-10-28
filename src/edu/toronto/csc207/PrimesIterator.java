package edu.toronto.csc207;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PrimesIterator implements Iterator<Integer> {

    private int next = 2;
    private Set<Integer> primesSoFar = new HashSet<>();

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int current = next;
        getReadyForNext();
        primesSoFar.add(current);
        return current;
    }

    private void getReadyForNext() {
        // Set next to the next prime number.
        next = next + 1; // next candidate
        while (!isPrime(next)) {
            next = next + 1;
        }
    }

    private boolean isPrime(int next) {
        int max = (int) Math.sqrt(next);

        // Check all the possible divisors between 2 and max, inclusive
//        for (int i = 2; i != max + 1; i++) {
        for (Integer i : primesSoFar) {
            if (next % i == 0) {
                return false;
            }
        }

        return true;
    }
}
