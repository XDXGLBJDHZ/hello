package com.array.pojo;

/**
 * 一维数组
 *
 * @author ME08I
 * @date 2021/8/16
 */
public class ArrayDemo1 {
    public static void main(String args[]) {
        /**
         * 一维数组初始化
         * */
        //动态数组初始化
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        //静态数组初始化
        //方法1
        int[] arr2 = new int[]{4, 5, 6};
        //方法2
        int[] arr3 = {7, 8, 9};
        for (int i = 0; i < 3; i++) {
            System.out.println(arr1[i]);
            System.out.println(arr2[i]);
            System.out.println(arr3[i]);
        }
        System.out.println("------------------");
        /**
         * 数组元素默认初始化值都是0
         * **/
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }
    }
}
