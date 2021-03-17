package com.codewithmosh;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        this.items = new int[length];
    }

    public void insert(int item) {
        this.resizeIfRequired();
        this.items[this.count++] = item;
    }

    public void insertAt(int item, int index) {
        if (index >= 0 && index <= this.count) {
            this.resizeIfRequired();

            for(int i = this.count - 1; i >= index; --i) {
                this.items[i + 1] = this.items[i];
            }

            this.items[index] = item;
            ++this.count;
        } else {
            throw new IllegalArgumentException();
        }
    }

    private void resizeIfRequired() {
        if (this.items.length == this.count) {
            int[] newItems = new int[this.count * 2];

            for(int i = 0; i < this.count; ++i) {
                newItems[i] = this.items[i];
            }

            this.items = newItems;
        }

    }

    public void reverse() {
        int[] newItems = new int[this.count];

        for(int i = 0; i < this.count; ++i) {
            newItems[i] = this.items[this.count - i - 1];
        }

        this.items = newItems;
    }

    public int max() {
        int max = 0;
        int[] var2 = this.items;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int item = var2[var4];
            if (item > max) {
                max = item;
            }
        }

        return max;
    }

    public Array intersect(Array other) {
        Array intersection = new Array(this.count);
        int[] var3 = this.items;
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int item = var3[var5];
            if (other.indexOf(item) >= 0) {
                intersection.insert(item);
            }
        }

        return intersection;
    }

    public void removeAt(int index) {
        if (index >= 0 && index < this.count) {
            for(int i = index; i < this.count; ++i) {
                this.items[i] = this.items[i + 1];
            }

            --this.count;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int indexOf(int item) {
        for(int i = 0; i < this.count; ++i) {
            if (this.items[i] == item) {
                return i;
            }
        }

        return -1;
    }

    public void print() {
        for(int i = 0; i < this.count; ++i) {
            System.out.println(this.items[i]);
        }

    }
}
