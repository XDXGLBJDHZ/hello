package com.array.pojo;

/**
 * 二维数组
 *
 * @author ME08I
 * @date 2021/8/17
 */
public class ArrayDemo2 {
    public static void main(String args[]) {
        /**
         * 一维数组中的每一个元素都是一个数组，这样的数组就是二维数组
         * */
        int[][] arr1 = new int[][]{
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8}
        };
        //动态初始化
        int[][] arr2 = new int[2][3];
    }
}
