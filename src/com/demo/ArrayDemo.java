package com.demo;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        /**
         * 初始化方式
         */
        //方式1
        //定义数组长度为3的数组
        int[] arr1=new int[3];
        arr1[0]=1;
        arr1[1]=2;
        arr1[2]=3;
        //数组最大长度为3，所以不能超出数组的最大长度
        // 否则会抛出ArrayIndexOutOfBoundsException
        //arr1[3]=4;
        //数组长度
        System.out.println(arr1.length);
        //打印数组元素
        System.out.println(Arrays.toString(arr1));
        //方式2
        int[] arr2=new int[]{1,2,3};
        //数组长度
        System.out.println(arr2.length);
        //打印数组元素
        System.out.println(Arrays.toString(arr2));
        //方式三
        int[] arr3={1,2,3};
        //数组长度
        System.out.println(arr3.length);
        //打印数组元素
        System.out.println(Arrays.toString(arr3));

        /**
         * 数组遍历
         */
        for (int i=0;i<arr1.length;i++){
            //通过下标进行访问
            System.out.println(arr1[i]);
        }

        /**
         * 数组扩容
         */
        //方式1
        //定义一个的数组，将原数组复制到新数组
        int[] arr4=new int[6];
        for (int i = 0; i < arr1.length; i++) {
            arr4[i]=arr1[i];
        }
        //打印长度
        System.out.println(arr4.length);
        //打印元素
        System.out.println(Arrays.toString(arr4));
        //方式2
        //参数含义
        /**
         * 参数1 原数组
         * 参数2 新数组长度
         */
        int[] arr5=Arrays.copyOf(arr1,6);
        //打印长度
        System.out.println(arr5.length);
        //打印元素
        System.out.println(Arrays.toString(arr5));
        //方式3
        int[] arr6=new int[6];
        //参数含义
        /**
         * 参数1 原数组
         * 参数2 从原数组的那个下标开始复制
         * 参数3 新数组
         * 参数4 从新数组到那个下标位置赋值
         * 参数5 复制多少个长度
         */
        System.arraycopy(arr1,0,arr6,0,arr1.length);
        //打印长度
        System.out.println(arr6.length);
        //打印元素
        System.out.println(Arrays.toString(arr6));

        //冒泡排序 从大到小
        for (int i = 0; i < arr6.length; i++) {
            for (int j = i+1; j < arr6.length; j++) {
                //进行比较
                if(arr6[i]<arr6[j]){
                    int temp=arr6[i];
                    arr6[i]=arr6[j];
                    arr6[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr6));
    }

}
