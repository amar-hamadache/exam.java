package datastructure.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    /*
     *
     * demonstrate how to use ArrayList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */
    public static void main(String[] args) {
     ArrayList<Integer> list = new ArrayList<>();
     list.add(2);
     list.add(5);
     list.add(6);
     System.out.println(list);
     list.remove(0);
     list.add(1);
     System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            
        }
        for (int i:list) {
            System.out.println(i);
            
        }

        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}



