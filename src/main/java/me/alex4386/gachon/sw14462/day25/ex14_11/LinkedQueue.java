package me.alex4386.gachon.sw14462.day25.ex14_11;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedQueue<T extends Object> extends LinkedList<T> {

    private int front;
    private int count;

    public LinkedQueue() {
        super();
        front = 0;
        count = 0;
    }

    public void addToQueue(T item) {
        this.add(item);
        this.count++;
    }

    public T removeFromQueue() {
        if (this.count == 0) {
            return null;
        }
        this.count--;
        return this.get(this.front++);
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = front;
            private int count = 0;

            @Override
            public boolean hasNext() {
                return count < LinkedQueue.this.count;
            }

            @Override
            public T next() {
                if (!this.hasNext()) return null;

                count++;
                return LinkedQueue.this.get(index++);
            }
        };
    }

    @Override
    public int size() {
        return this.count;
    }
}
