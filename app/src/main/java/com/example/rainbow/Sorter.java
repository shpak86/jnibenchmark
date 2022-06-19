package com.example.rainbow;

public class Sorter {

    static final int DEFAULT_ARRAY_SIZE = 65536;

    private int arraySize;
    private int[] items;

    Sorter() {
        this(DEFAULT_ARRAY_SIZE);
    }

    Sorter(int size) {
        this.arraySize = size;
        this.items = new int[size];
        for (int i = 0; i < arraySize; i++) {
            items[i] = Double.valueOf(Math.random() * 100000.0).intValue();
        }
    }

    long bubble() {
        long t = System.currentTimeMillis();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arraySize - 1; i++) {
                if (items[i] > items[i + 1]) {
                    isSorted = false;
                    int tmp = items[i];
                    items[i] = items[i + 1];
                    items[i + 1] = tmp;
                }
            }
        }
        return System.currentTimeMillis() - t;
    }
}
