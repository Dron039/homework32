package homework74;

import java.util.Arrays;

public class MyArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final int DEFAULT_SIZE = 0;

    private Object[] data;

    private int size;

    private int capacity;

    public MyArrayList() {
        this(DEFAULT_CAPACITY);

    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.size = DEFAULT_SIZE;
        this.data = new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    private void ensureCapacity(int elementCount) {
        if (elementCount < capacity) {
            capacity = (int) (capacity * 1.5 + 1);
            data = Arrays.copyOf(data, capacity);
        }
    }

    public void addLast(T t) {
        ensureCapacity(size + 1);
        data[size] = t;
        size++;
    }
    public void removeFirst() {
        data = Arrays.copyOfRange(data,1,capacity + 1);
        size--;
    }

    public void addFirst(T t) {
        ensureCapacity(size + 1);
        Object[] newData = new Object[capacity];
        System.arraycopy(data, 0, newData, 1, size);
        newData[0]=t;
        data = newData;
        size++;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
           sb.append(data[i]).append(" ");

        }

        return sb.toString();
    }
}
