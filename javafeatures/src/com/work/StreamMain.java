package com.work;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        // create a list
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(50);
        list1.add(21);
        list1.add(22);
        list1.add(67);
        //filter all even number from list1 without stream
        List<Integer> listEven = new ArrayList<>();
        for (Integer i:list1)
        {
            if (i%2 == 0)
            {
                listEven.add(i);
            }
        }

        System.out.println("output of list1 :" + list1);
        System.out.println("output of without stream :"+ listEven);

        //filter all even number from list1 using stream
       List<Integer> newList = list1.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.println("output of using stream :"+ newList);


    }
}
