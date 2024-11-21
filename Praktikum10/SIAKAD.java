package Praktikum10;

import java.util.ArrayList;
import java.util.Scanner;

public class SIAKAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ArrayList untuk menyimpan data siswa dan mata kuliah
        ArrayList<String[]> mahasiswa = new ArrayList<>();
        ArrayList<String> mataKuliah = new ArrayList<>();

        String nama, matkul;
        int jumlahSiswa, jumlahMatkul;
        
        // Input jumlah mata kuliah
        System.out.print("Masukkan jumlah mata kuliah: ");
        jumlahMatkul = sc.nextInt();
        sc.nextLine();  // Mengonsumsi newline karakter

        // Input mata kuliah
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            matkul = sc.nextLine();
            mataKuliah.add(matkul);
        }

        // Input jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        jumlahSiswa = sc.nextInt();
        sc.nextLine();  // Mengonsumsi newline karakter

        // Input data siswa dan pilih mata kuliah
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nama siswa ke-" + (i + 1) + ": ");
            nama = sc.nextLine();
            
            String[] daftarMataKuliahSiswa = new String[jumlahMatkul];
            
            System.out.println("Mata Kuliah untuk " + nama + ": ");
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.println((j + 1) + ". " + mataKuliah.get(j));
            }
            
            // Pilih mata kuliah
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Apakah " + nama + " ingin memilih mata kuliah " + mataKuliah.get(j) + "? (y/n): ");
                String pilihan = sc.nextLine();
                daftarMataKuliahSiswa[j] = (pilihan.equalsIgnoreCase("y") ? mataKuliah.get(j) : "Tidak memilih");
            }
            
            // Menyimpan data siswa
            mahasiswa.add(daftarMataKuliahSiswa);
        }

        // Menampilkan data siswa dan mata kuliah yang dipilih
        System.out.println("\nData Siswa dan Mata Kuliah yang Dipilih:");
        for (int i = 0; i < mahasiswa.size(); i++) {
            System.out.print("Siswa: " + mahasiswa.get(i)[0] + " memilih mata kuliah: ");
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print(mahasiswa.get(i)[j] + " ");
            }
            System.out.println();
        }
    }
}
