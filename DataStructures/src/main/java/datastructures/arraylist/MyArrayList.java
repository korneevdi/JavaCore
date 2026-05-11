package datastructures.arraylist;

public class MyArrayList<T> {

    private T[] list;

    private static final int INITIAL_CAPACITY = 1;

    private int size;

    // Default constructor
    public MyArrayList() {
        list = createArray(INITIAL_CAPACITY);
    }

    // Custom constructor
    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive. Input: " + capacity);
        } else {
            list = createArray(capacity);
        }
    }

    // ######### Public methods #########

    // Add new element to the end
    public void add(T element) {
        if(element == null) {
            throw new IllegalArgumentException("Element must not be null");
        }
        if(size == list.length) {
            increaseList();
        }
        list[size] = element;
        size++;
    }

    // Add new element at the specific position
    public void add(int index, T element) {
        if(index < 0) {
            throw new IndexOutOfBoundsException("Index must be non-negative");
        }
        if(index > size) {
            throw new IndexOutOfBoundsException("Size of list is: " + size);
        }
        if(element == null) {
            throw new IllegalArgumentException("Element must not be null");
        }
        if(size == list.length) {
            increaseList();
        }
        for(int i = size - 1; i >= index; i--) {
            list[i + 1] = list[i];
        }
        list[index] = element;
        size++;
    }

    // Remove specific element
    public void remove(T element) {
        if(element == null) {
            return;
        }
        int firstIndex = indexOf(element);
        if(firstIndex != -1) {
            deleteElement(firstIndex);
        }
    }

    // Remove element from specific position
    public void removeAt(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Illegal index");
        }
        deleteElement(index);
    }

    // Size of the list
    public int size() {
        return size;
    }

    // Clear list
    public void clear() {
        list = createArray(INITIAL_CAPACITY);
        size = 0;
    }

    // Check whether the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Search an element in the list
    public int indexOf(T element) {
        if(element == null) {
            return -1;
        }
        for(int i = 0; i < size; i++) {
            if(element.equals(list[i])) {
                return i;
            }
        }
        return -1;
    }

    // Get an element from the list
    public T get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Illegal index");
        }
        return list[index];
    }

    // ######### Auxiliary methods #########

    // Increase the array size
    private void increaseList() {
        T[] newList = createArray(size + size/2 + 1);
        System.arraycopy(list, 0, newList, 0, size);
        list = newList;
    }

    // Delete an element at specific index
    private void deleteElement(int index) {
        for(int i = index; i < size - 1; i++) {
            list[i] = list[i + 1];
        }
        list[size - 1] = null;
        size--;
    }

    // Create generic array
    @SuppressWarnings("unchecked")
    private T[] createArray(int capacity) {
        return (T[]) new Object[capacity];
    }
}
