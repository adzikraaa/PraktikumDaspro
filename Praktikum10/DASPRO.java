package Praktikum10;

import java.util.Scanner;

public class DASPRO {
    public static void main(String[] args) {

int[][] survey = new int[10][6]; // Array untuk menyimpan hasil survei
Scanner sc = new Scanner(System.in);

// Poin A: Input data survei
for (int i = 0; i < 10; i++) { // Loop untuk responden
    for (int j = 0; j < 6; j++) { // Loop untuk pertanyaan
        System.out.print("Masukkan nilai survei untuk Responden " + (i + 1) + ", Pertanyaan " + (j + 1) + ": ");
        survey[i][j] = sc.nextInt();
    }
}

// Poin B: Hitung rata-rata per responden
for (int i = 0; i < 10; i++) {
    int totalResponden = 0;
    for (int j = 0; j < 6; j++) {
        totalResponden += survey[i][j];
    }
    double rataRataResponden = totalResponden / 6.0;
    System.out.println("Rata-rata Responden " + (i + 1) + ": " + rataRataResponden);
}

// Poin C: Hitung rata-rata per pertanyaan
for (int j = 0; j < 6; j++) {
    int totalPertanyaan = 0;
    for (int i = 0; i < 10; i++) {
        totalPertanyaan += survey[i][j];
    }
    double rataRataPertanyaan = totalPertanyaan / 10.0;
    System.out.println("Rata-rata Pertanyaan " + (j + 1) + ": " + rataRataPertanyaan);
}

// Poin D: Hitung rata-rata keseluruhan
int totalKeseluruhan = 0;
for (int i = 0; i < 10; i++) {
    for (int j = 0; j < 6; j++) {
        totalKeseluruhan += survey[i][j];
    }
}
double rataRataKeseluruhan = totalKeseluruhan / 60.0;
System.out.println("Rata-rata Keseluruhan: " + rataRataKeseluruhan);
    }
}
