package com.bit.sort;

/**
 * @Author: BaiMiao
 * @Date: 2020/3/18 17:06
 * @Description:
 */
public class insertSort {
    public static int insertSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int v=array[i];
            int j=i-1;
            for (;j>=0 && array[j]>v;j--){
                array[j+1]=array[j];
            }
            array[j+1]=v;
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
        return array.length;
    }

    public static void main(String[] args) {
        int[] array={2,6,9,8,7};
        System.out.println(insertSort(array));
    }
}
