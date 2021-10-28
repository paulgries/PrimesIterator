package edu.toronto.csc207;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Iterator<Integer> primesIterator = new PrimesIterator();

        System.out.println(primesIterator.next()); // 2
        System.out.println(primesIterator.next()); // 3
        System.out.println(primesIterator.next()); // 5
        System.out.println(primesIterator.next()); // 7
        System.out.println(primesIterator.next()); // 11
    }
}
