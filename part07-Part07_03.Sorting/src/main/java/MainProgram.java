import java.util.Arrays;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);

    }
    //methods below
    //methods below

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int start : array) {
            if (start < smallest) {
                smallest = start;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                index = i;
                smallest = array[i];
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                index = i;
                smallest = table[i];
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        //find smallest 
        //smallest(array), indexOfSmallest(array)

        //put smallest in 0, and so on..
        //indexOfSmallestFrom(array, int startIndex), 
        //swap(array, int index1, int index2)
        //prints contents before and after sorting (this checks if it's working)
        for (int i = 0; i < array.length; i++) {
            System.out.println(array);
            int indexOfSmallest = indexOfSmallestFrom(array, i);
            swap(array, indexOfSmallest, i);
            System.out.println(array);
        }

    }

}
