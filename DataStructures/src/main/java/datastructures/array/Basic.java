package datastructures.array;

import java.util.Arrays;

public class Basic {

    public static void main(String[] args) {

        // Creation of array
        int [] array;           // declaration
        array = new int [5];    // instantiation
        array[0] = 1;           // initialization
        array[1] = 13;
        array[2] = -4;
        array[3] = 25;
        array[4] = 6;

        System.out.println(Arrays.toString(array));

        // All together
        String sArray[] = {"banana", "apple", "orange"};
        System.out.println(Arrays.toString(sArray));
    }
}
