package datastructures.array;

public class Main {

    public static void main(String[] args) {

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
    }
}
