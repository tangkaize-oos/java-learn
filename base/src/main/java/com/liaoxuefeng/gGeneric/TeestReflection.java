package com.liaoxuefeng.gGeneric;

import java.util.Arrays;

/**
 * @author: 李将
 * @since: 2020/6/9 21:01
 * @Descprition:
 */
public class TeestReflection {

    public static <K> K[] pickTwo(K k1, K k2, K k3) {
        return asArray(k1, k2);

    }

    public static <T> T[] asArray(T... objs) {
        return objs;
    }

    public static void main(String[] args) {

        String[] arr = asArray("one", "two", "three");
        System.out.println(Arrays.toString(arr));

 /*       String[] firstTwo = pickTwo("one", "two", "three");
        System.out.println(Arrays.toString(firstTwo));*/
    }
}
