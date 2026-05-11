package datastructures.arraylist;

public class MyArrayList {

    private Integer[] list;

    private static final int INITIAL_CAPACITY = 1;

    private int size;

    // Default constructor
    public MyArrayList() {
        list = new Integer[INITIAL_CAPACITY];
    }

    // Custom constructor
    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            System.out.println("Initial capacity must be positive. Input: " + capacity);
        } else {
            list = new Integer[capacity];
        }
    }

    // ######### Methods #########

    // Add new element to the end
    public void add(Integer element) {

    }

    // Add new element at the specific position
    public void addAt(int index, Integer element) {

    }

    // Remove specific element
    public void remove(Integer element) {

    }

    // Remove element from specific position
    public void removeAt(int index) {

    }

    // Clean list
    public void clean() {

    }

    // Search element in the list
    public void search(Integer element) {

    }
}
