package com.yoyo.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {

        //list();
    }

    private static void list() {
        ArrayList<Integer> scores=new ArrayList<>();
        scores.add(5);
        scores.add(1);
        scores.add(3);
        System.out.println(scores);

        List<Integer> list= Arrays.asList(5,1,3,4,3);
//        list.add(123);
        System.out.println(list);
        for (int num : list) {
            System.out.println(num);
        }
    }
}
