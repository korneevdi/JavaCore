package datastructures.array;

public class TwoDimensionalArray {

    int[][] array2D;

    public TwoDimensionalArray(int numberOfRows, int numberOdColumns) {
        array2D = new int[numberOfRows][numberOdColumns];
        for(int i = 0; i < array2D.length; i++) {
            for(int j = 0; j < array2D[0].length; j++) {
                array2D[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void insert(int row, int column, int value) {
        try{
            if(array2D[row][column] == Integer.MIN_VALUE) {
                array2D[row][column] = value;
                System.out.printf("Element %s successfully inserted at position [%s, %s]%n", value, row, column);
            } else {
                System.out.printf("Position [%s, %s] is already occupied%n", row, column);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("Invalid indices: [%s, %s]%n", row, column);
        }
    }

    public void traverse() {
        System.out.print("[ ");
        for(int i = 0; i < array2D.length; i++) {
            System.out.print("[");
            for(int j = 0; j < array2D[0].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.print("] ");
        }
        System.out.printf("]%n");
    }

    public void search(int value) {
        for(int i = 0; i < array2D.length; i++) {
            for(int j = 0; j < array2D[0].length; j++){
                if(array2D[i][j] == value) {
                    System.out.printf("Element %s found at position [%s, %s]%n", value, i, j);
                    return;
                }
            }
        }
        System.out.println("Element " + value + " not found\n");
    }

    public void delete(int row, int column) {
        if(row < 0 || row >= array2D.length || column < 0 || column >= array2D[0].length) {
            System.out.printf("Invalid index: [%s, %s]%n", row, column);
            return;
        }
        if(array2D[row][column] == Integer.MIN_VALUE) {
            System.out.println("Nothing to delete\n");
        } else {
            array2D[row][column] = Integer.MIN_VALUE;
            System.out.printf("Element at position [%s, %s] successfully deleted%n", row, column);
        }
    }
}
