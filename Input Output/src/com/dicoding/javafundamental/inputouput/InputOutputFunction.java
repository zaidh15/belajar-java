package com.dicoding.javafundamental.inputouput;

import java.util.Scanner;

public class InputOutputFunction {

    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);
        System.out.println("Program penjumlahan sederhana");
        System.out.println("Masukan Angka pertama : ");
        int value = scanner.nextInt();
        System.out.println("Masukan Angka kedua : ");
        int anotherValue = scanner.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);
    }
}
