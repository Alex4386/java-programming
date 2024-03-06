package me.alex4386.gachon.sw14462.day02;

import java.util.ArrayList;
import java.util.List;

public class IntegerIterator {
    private final int rangeStart;
    private final int rangeEnd;

    public IntegerIterator(int rangeStart, int rangeEnd) throws InvalidRangeException {
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;

        if (!this.isRangeValid()) throw new InvalidRangeException();
    }

    private boolean isRangeValid() {
        if (this.rangeEnd - this.rangeStart < 0) return false;
        return true;
    }

    public List<Integer> getIntegersBetween() {
        List<Integer> list = new ArrayList<>();
        for (int i = this.rangeStart; i <= this.rangeEnd; i++) {
            list.add(i);
        }

        return list;
    }
}
