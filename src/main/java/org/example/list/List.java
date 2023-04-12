package org.example.list;

public interface List<T> {
    T[] getArray();
    void addAll(T[] array);
    int getSize();
    T getElementByIndex(int index);
}
