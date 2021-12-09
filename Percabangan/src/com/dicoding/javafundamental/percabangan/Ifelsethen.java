package com.dicoding.javafundamental.percabangan;

import java.util.Scanner;

public class Ifelsethen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int nilaiUjian = 80;
        char indeksPrestasi;

        System.out.println("Masukkan nilai siswa ");
        int nilaiUjian = scanner.nextInt();

        if (nilaiUjian >= 90) {
            indeksPrestasi = 'A';
        } else if (nilaiUjian >= 80) {
            indeksPrestasi = 'B';
        } else if (nilaiUjian >= 70) {
            indeksPrestasi = 'C';
        } else {
            indeksPrestasi = 'D';
        }

        System.out.println("Nilai yand didapatkan adalah " + indeksPrestasi);
    }
}
