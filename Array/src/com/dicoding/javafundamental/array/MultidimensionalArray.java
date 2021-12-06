package com.dicoding.javafundamental.array;

public class MultidimensionalArray {

    public static void main(String[] args) {
        String[][] arrString = new String[2][];
        arrString[0] = new String[2];
        arrString[1] = new String[3];

//        Dimention 1 with 2 element
        arrString[0][0] = "A";
        arrString[0][1] = "B";

//        Dimention 2 with 3 element
        arrString[1][0] = "C";
        arrString[1][1] = "D";
        arrString[1][2] = "E";

//        Show all dimention 1
        System.out.println("Dimention 1 [0] and [0] is " + arrString[0][0]);
        System.out.println("Dimention 1 [0] and [1] is " + arrString[0][1]);

//        Show all dimention 2
        System.out.println("Dimention 2 [1] and [0] is " + arrString[1][0]);
        System.out.println("Dimention 2 [1] and [1] is " + arrString[1][1]);
        System.out.println("Dimention 2 [1] and [2] is " + arrString[1][2]);

    }
}
