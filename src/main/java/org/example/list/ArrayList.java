package org.example.list;

import java.util.Arrays;

public class ArrayList<T> implements List<T> {

    private final Object[] array;
    private final int size;

    public ArrayList(int size) {
        this.array = new Object[size];
        this.size = size;
    }

    public ArrayList(T[] array) {
        this.size = array.length;
        this.array = new Object[size];
        addAll(array);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T getElementByIndex(int index) {
        return (T) array[index];
    }

    @Override
    public void addAll(T[] array) {
        System.arraycopy(array, 0, this.array, 0, array.length);
    }

    @Override
    public T[] getArray() {
        return copyArray(this.size);
    }

    private T[] copyArray(int size) {
        T[] array = (T[]) new Object[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (T) this.array[i];
        }
        return array;
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}
