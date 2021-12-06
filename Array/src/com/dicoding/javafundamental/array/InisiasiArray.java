package com.dicoding.javafundamental.array;

public class InisiasiArray {
    public static void main(String[] args) {
        int[] arrInt = new int[10000];
//        int[] arrInt = new int[]{1, 2, 3, 4, 5, 6};
//        String[] arrString = new String[]{"Cat", "Dog", "Bird"};
//        System.out.println(arrInt[0]);
//        System.out.println(arrInt[1]);
//        System.out.println(arrInt[2]);
//        System.out.println(arrInt[3]);
//        System.out.println(arrInt[4]);
//        System.out.println(arrInt[5]);

//        System.out.println(arrString[0]);
//        System.out.println(arrString[1]);
//        System.out.println(arrString[2]);

        for (int x = 0; x < arrInt.length; x++){
            arrInt[x] = x + 1;
            System.out.println(arrInt[x]);
        }
    }
}
