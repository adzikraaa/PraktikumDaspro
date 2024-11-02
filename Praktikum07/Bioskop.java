package Praktikum07;

import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double hargaTiket = 50000, totalHarga, totalDiskon = 0;
        int totalTiket;
        

        do { 
        System.out.print("masukan jumlah tiket: ");
        totalTiket = sc.nextInt();
        
        if (totalTiket <= 0) {
            System.out.println("Transaksi dibatalkan");
            totalTiket = sc.nextInt();
            break;
        }
        if (totalTiket > 4){
            totalDiskon = 0.90;
            System.out.println("Mendapat diskon 10%");
        }
        if (totalTiket > 10){
            totalDiskon = 0.85;
            System.out.println("Mendapat diskon 15%");
            
        }
        else if (totalTiket < 4){
            System.out.println("Tidak mendapatkan diskon");
            
        }
        totalHarga = hargaTiket * totalDiskon;
        System.out.println("Total jumlah tiket: " + totalTiket);
        System.out.println("Total harga tiket: Rp." + totalHarga * totalTiket); 
        } while (true);

       


        
    }
}
