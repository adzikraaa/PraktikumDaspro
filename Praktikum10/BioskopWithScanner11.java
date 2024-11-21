package Praktikum10;

import java.util.Scanner;

public class BioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matriks untuk menyimpan data penonton
        String[][] penonton = new String[4][2];
        int baris, kolom;
        String next, nama;
        int pilihan;

        // Loop utama untuk menjalankan menu
        while (true) {
            System.out.println("--------------------------------------------");
            System.out.println("PILIHAN MENU");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan (1/2/3): ");
            pilihan = sc.nextInt();
            sc.nextLine();  // Mengonsumsi newline karakter

            if (pilihan == 1) {
                // Input data penonton
                System.out.print("Masukkan Nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan Baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan Kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();  // Mengonsumsi newline karakter

                // Memeriksa apakah nomor baris dan kolom valid
                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out.println("Nomor baris atau kolom tidak tersedia. Silakan masukkan lagi.");
                } else if (penonton[baris - 1][kolom - 1] != null) {
                    // Memeriksa apakah kursi sudah terisi
                    System.out.println("Kursi ini sudah terisi, silakan pilih kursi lain.");
                } else {
                    // Menyimpan data penonton ke dalam matriks
                    penonton[baris - 1][kolom - 1] = nama;
                }
            } else if (pilihan == 2) {
                // Menampilkan daftar penonton
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.print(penonton[i][j] == null ? "Kosong\t" : penonton[i][j] + "\t");
                    }
                    System.out.println();
                }
            } else if (pilihan == 3) {
                // Keluar dari program
                System.out.println("Terima kasih! Program selesai.");
                break;
            } else {
                System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }
}
