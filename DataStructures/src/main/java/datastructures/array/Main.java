package datastructures.array;

public class Main {

    public static void main(String[] args) {

        // One-dim array
/*
        SingleDimensionalArray array = new SingleDimensionalArray(4);
        array.insert(0, 12);
        array.insert(1, -1);
        array.insert(2, 4);
        array.insert(3, 6);
        array.insert(3, 81);
        array.insert(7, -2);

        array.traverse();

        array.search(-5);
        array.search(6);

        array.delete(-1);
        array.delete(2);

        array.traverse();
 */

        // Two-dim array

        TwoDimensionalArray array2D = new TwoDimensionalArray(2, 2);
        array2D.insert(0, 0, -18);
        array2D.insert(0, 1, 4);
        array2D.insert(1, 0, 8);
        array2D.insert(1, 1, -1);
        array2D.insert(0, 2, -18);
        array2D.insert(3, 0, -18);

        array2D.traverse();

        array2D.search(8);
        array2D.search(16);

        array2D.delete(1, 1);
        array2D.delete(1, 4);

        array2D.traverse();
    }
}
