package com.google.common.hash;

class LongAdder implements com.google.common.hash.LongAddable {

    private long value;

    public void increment() {
        value++;
    }

    public void add(long x) {
        value += x;
    }

    public long sum() {
        return value;
    }

}
