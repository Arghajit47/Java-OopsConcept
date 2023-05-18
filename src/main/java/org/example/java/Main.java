package org.example.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

   //Array
        int[] marks = new int[10];
        marks[0] = 50;
        marks[4] = 90;
        marks[2] = 89;
        for (int i = 0; i< 10; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("Array length is :" + marks.length);
        //Array sorting
        Arrays.sort(marks);
        for (int i = 0; i< 10; i++) {
            System.out.print(marks[i] + ", ");
        }
        System.out.println("");


    //ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        //add Element
        for (int val = 0; val < 10; val++) {
            list.add(val);
        }
        System.out.println(list);

        //add Element in specific index

        list.add(10, 236);

        //get Element
        for (int index = 0; index < 10; index++) {
            System.out.println(list.get(index));
        }

        //Change Element
        list.set(9, 550);
        System.out.println(list);

        //Delete Element
        for (int index = 0; index < 5; index++) {
            list.remove(index);
        }
        System.out.println(list);
        System.out.println(list.size());
        Collections.sort(list);
        System.out.println(list);
    }
}