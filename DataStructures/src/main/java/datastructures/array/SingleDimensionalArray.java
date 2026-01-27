package datastructures.array;

public class SingleDimensionalArray {

    int[] array;

    public SingleDimensionalArray(int size) {
        array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int index, int value) {
        try{
            if(array[index] == Integer.MIN_VALUE) {
                array[index] = value;
                System.out.printf("Element %s successfully inserted at index %s%n", value, index);
            } else {
                System.out.printf("This index (%s) is already occupied%n", index);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("Invalid index: %s%n", index);
        }
    }

    public void traverse() {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void search(int value) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                System.out.println("Element " + value + " found at position " + i);
                return;
            }
        }
        System.out.println("Element " + value + " not found");
    }

    public void delete(int index) {
        if(index < 0 || index >= array.length) {
            System.out.println("Invalid index: " + index);
            return;
        }
        array[index] = Integer.MIN_VALUE;
        System.out.println("Element at position " + index + " successfully deleted");
    }
}
