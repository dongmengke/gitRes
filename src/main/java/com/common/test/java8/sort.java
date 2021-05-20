package com.common.test.java8;

import java.util.Arrays;
import java.util.Random;

public class sort {
    private static final int[] arry = {2, 3, 5, 6, 1, 4, 8, 1, 2, 10, 20, 11};
    private static int[] checkArry = null;


    public static void main(String[] args) {
        //选择排序
        sout(sort(arry));
        //冒泡排序2
//        sout(mpSort2());
//        sout(crSort());


        check();
    }

    /**
     * 插入排序
     *
     * @return
     */
    public static int[] crSort() {

        for (int i = 1; i < arry.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arry[j] < arry[j - 1]) {
                    swap(arry, j, j - 1);
                }
            }
        }
        return arry;
    }

    /**
     * 冒泡排序 返回值为排序后的数组
     *
     * @return
     */
    public static int[] sort( int[] arry) {
        for (int i = 0; i < arry.length; i++) {
            int mainValue = i;
            for (int j = i + 1; j < arry.length; j++) {
                if (arry[mainValue] > arry[j]) {
                    mainValue = j;
                }
            }
//            System.out.println("minPos:"+ mainValue);
            swap(arry, mainValue, i);
        }
        return arry;
    }

    /**
     * 冒泡排序
     *
     * @return
     */
    public static int[] mpSort2() {

        for (int j = arry.length; j >= 1; j--) {
            for (int i = 0; i < j - 1; i++) {
                if (arry[i] > arry[i + 1]) {
                    swap(arry, i, i + 1);
                }
            }
        }

        return arry;
    }

    /**
     * 遍历打印出arr数组中的元素
     *
     * @param arr
     */
    public static void sout(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 交换arr数组中下标为left和下标为right的元素的值
     *
     * @param arr
     * @param left
     * @param right
     */
    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void check() {
        generateRandomArray();
        int[] arry2 = new int[checkArry.length];
        System.arraycopy(checkArry, 0, arry2, 0, checkArry.length);
        Arrays.sort(arry2);
        sort(checkArry);
        boolean same = true;
        for (int i = 0; i < checkArry.length; i++) {
            if (checkArry[i] != arry2[i]) {
                same = false;
            }
        }
        System.out.println(same == true ? "right" : "wrong");
    }

    public static void generateRandomArray() {
        Random random = new Random();
        checkArry = new int[10000];
        for (int i = 0; i < checkArry.length; i++) {
            checkArry[i] = random.nextInt();
        }
    }
}
