package datastructure.collections;

import java.util.HashSet;
import java.util.Set;

public class UseHashSet {

    /*
     *
     * demonstrate how to use HashSet that includes add,remove elements
     * add these elements to your collections: 3,3,4,1,7,1,0,7,4,5,0,9,8
     * use for each loop to print out data
     * print out the number of the elements of your HashSet
     *
     */

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(7);
        set.add(1);
        set.add(0);
        set.add(7);
        set.add(4);
        set.add(5);
        set.add(0);
        set.add(9);
        set.add(8);
        for (int i:set) {
            System.out.println(i);

        }
        System.out.println(set.size());

    }
}
