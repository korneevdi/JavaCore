package datastructures.array;

import java.util.Arrays;

public class Basic {

    public static void main(String[] args) {

        // ONE-DIMENSIONAL ARRAY

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


        // TWO-DIMENSIONAL ARRAY

        // Creation of array
        int [][] array2D;           // declaration
        array2D = new int [2][2];   // instantiation
        array2D[0][0] = 1;          // initialization
        array2D[0][1] = -8;
        array2D[1][0] = 19;
        array2D[1][1] = 2;

        System.out.println(Arrays.deepToString(array2D));

        // All together
        String[][] sArray2D = {{"red", "yellow"}, {"blue", "violet"}};
        System.out.println(Arrays.deepToString(sArray2D));
    }
}
