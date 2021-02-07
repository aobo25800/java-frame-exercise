package com.zjz.demo;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Demo02 {
    public static void main(String[] args){
        byte[] a = new byte[]{1, 2};

        Integer[] b = {12, 111, 123, 156, 189};
        Integer.valueOf(12);
        Arrays.sort(b, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}

