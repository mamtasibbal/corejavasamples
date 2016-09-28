package com.qauber.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mamtasibbal on 9/27/16.
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<Integer>();

        //add
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(1); //will be ignored as it is duplicate
        integerSet.add(2); //will be ignored as it is duplicate

        System.out.println("After adding:");
        for(int i : integerSet) {
            System.out.println(i);
        }

        //remove
        integerSet.remove(2);
        
        System.out.println("After removing:");
        for(int i : integerSet) {
            System.out.println(i);
        }




    }
}
