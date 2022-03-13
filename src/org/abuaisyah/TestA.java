package org.abuaisyah;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* Given an array of size n, find the majority element.
* The majority element is the element that appears more than floor(n/2) times.
* You may assume that the array is non-empty and the majority element always exist in the array.
* Example :
*
* Input : [2, 1, 2]
* Return  : 2 which occurs 2 times which is greater than 3/2.
* */
public class TestA {
    public static void main(String[] args) {
        Integer[] arr = {2, 2, 1, 1, 1};
        List list = Arrays.asList(arr);

        System.out.println(solution(list));
    }

    public static Integer solution(List<Integer> A) {
        /**
         * cari bilangan yang paling sering muncul && bilangannya  harus lebih besar dari size A /2
         */
        //kita siampkan map untuk nampung bilangan, counternya
        Map<Integer, Integer> map = new HashMap();
        //looping A
        boolean isFirst = true;
        int resultBilangan = 0;
        int resultCounter = 0;
        for (Integer item : A) {
            //iffirst
            if (isFirst) {
                //resultBilangan = item
                resultBilangan = item.intValue();
                //resultCounter = 1
                resultCounter = 1;
                isFirst = false;
            }
            //kalau item ada di map
            if (map.containsKey(item)) {
                //maka counter = counter di map + 1
                int counter = map.get(item).intValue()+1;
                map.put(item, counter);
                //kalau counter > resultCounter && A.size/2
                if (counter > resultCounter && counter > A.size()/2) {
                    //resultCounter = counter
                    resultCounter = counter;
                    //resultBilanga = item
                    resultBilangan = item;
                }
            } else {
            //kalau tidak ada masukan ke map {item, 1}
                map.put(item, 1);
            }
        }

        return resultBilangan;
    }
}
