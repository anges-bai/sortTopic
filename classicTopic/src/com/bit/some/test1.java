package com.bit.some;

/**
 * @Author: BaiMiao
 * @Date: 2020/3/19 10:41
 * @Description:
 */
public class test1 {
    public static void insertSort(int[] array){
        for (int i = 1; i <array.length ; i++) {
            int v=array[i];
            int j=i-1;
            for (;j>=0 && array[j]>v;j--){
                array[j+1]=array[j];
            }
            array[j+1]=v;
        }
    }
    public static void shellSort(int[] array){
        int gap=array.length;
        while (gap>1){
            insertSortGap(array,gap);
            gap=gap/2;
        }
        insertSortGap(array,1);
    }
    public static void insertSortGap(int[] array,int gap){
        for (int i = 1; i <array.length ; i++) {
            int v=array[i];
            int j=i-gap;
            for (;j>=0 && array[j]>v;j=j-gap){
                array[j+gap]=array[j];
            }
            array[j+gap]=v;
        }
    }
}
