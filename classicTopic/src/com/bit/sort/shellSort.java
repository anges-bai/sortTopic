package com.bit.sort;

/**
 * @Author: BaiMiao
 * @Date: 2020/3/19 18:55
 * @Description:
 */
public class shellSort {
    public static int shellSort(int[] array){
        int gap=array.length;
        while (gap>1){
           insertSortGap(array,gap);
           gap=gap/2;
        }
        insertSortGap(array,1);
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
        return array.length;
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

    public static void main(String[] args) {
        int[] a={9,2,6,5,1};

          shellSort(a);

    }
}
