package com.box.leetcode.sort;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/4/25
 */
public class QuickSort {

    public static void quickSort(int[] array, int left, int right) {
        if (left > right) {
            return;
        }
        int i = left;
        int j = right;
        int temp = array[left];
        while (i < j) {
            while (temp <= array[j] && i < j) {
                j--;
            }
            while (temp >= array[i] && i < j) {
                i++;
            }
            if (i < j) {
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
        array[left] = array[i];
        array[i]=temp;
        quickSort(array,left,j-1);
        quickSort(array,j+1,right);
    }

    public static void main(String[] args) {
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
