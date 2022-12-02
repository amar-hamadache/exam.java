package datastructure.collections;

import java.util.*;

public class UseCollections {

    /*
     *
     * given 2 arrays, array1 and array2
     * int[] array1 = {1, 3, 2, 4, 8, 9, 0}
     * int[] array2 = {1, 3, 7, 5, 4, 0, 7, 5}
     *
     * use collections (List and Set to solve this exercise)
     *
     * 1. find union of the two arrays. output: [0, 1, 2, 3, 4, 5, 7, 8, 9]
     * 2. find the intersection of the two arrays. output: [0, 1, 3, 4]
     * 3. find the symmetric difference of the two arrays. output: [2, 5, 7, 8, 9]
     *
     */

    public static void main(String[] args) {
        Set<Integer> array1 = new HashSet<>();
          array1.add(1);
        array1.add(3);
        array1.add(2);
        array1.add(4);
        array1.add(8);
        array1.add(9);
        array1.add(0);
        Set<Integer> array2 = new HashSet<>();
        array2.add(1);
        array2.add(3);
        array2.add(7);
        array2.add(5);
        array2.add(4);
        array2.add(0);
        array2.add(7);
        array2.add(5);
        array1.addAll(array2);
        System.out.println(array1);
        array1.retainAll(array2);
        System.out.println(array1);


    }

}
