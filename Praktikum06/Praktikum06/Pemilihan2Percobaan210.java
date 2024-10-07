package Praktikum06;

import java.util.Scanner;

public class Pemilihan2Percobaan210 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner (System.in);

        int pilihan_menu;
        double diskon, total_bayar = 0, harga;
        String member, jenis_pembayaran;

        int potonganQRIS = 1000;

        System.out.println("----------");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = sc10.nextInt();
        sc10.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = sc10.nextLine();
        System.out.print("Masukkan jenis pembayaran (QRIS/TUNAI)? = ");
        jenis_pembayaran = sc10.nextLine();
        
        System.out.println("-----------------------------------");

       


        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
        System.out.println("Besar diskon = 10%");

        if (pilihan_menu == 1){
            harga = 14000;
            System.out.println("Harga Ricebowl = "+ harga);
 
        }   else if (pilihan_menu == 2){
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

        }   else if (pilihan_menu == 3){
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

        }   else {
                System.out.println("Masukkan pilihan menu yang benar");
                return;

        }

        total_bayar = harga - (harga * diskon);
        System.out.println("Total bayar setelah diskon = " + total_bayar);
    }

        else if (member.equalsIgnoreCase("n")){
            diskon = 0;
        System.out.println("Besar diskon = 0%");
        if (pilihan_menu == 1){
            harga = 14000;
            System.out.println("Harga Ricebowl = " + harga);
 
        }   else if (pilihan_menu == 2){
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

        }   else if (pilihan_menu == 3){
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

        }   else {
                System.out.println("Masukkan pilihan menu yang benar");
                return;

        }

        total_bayar = harga - (harga * diskon);

        System.out.println("total bayar =" + total_bayar );    

    } else {
        System.out.println("Member tidak valid");
    }
    System.out.println("------------------------");

    if (jenis_pembayaran.equalsIgnoreCase("QRIS")){
        total_bayar -= potonganQRIS;
        System.out.println("Potongan QRIS Rp. 1000");
    }

    
    System.out.println("Total bayar qris " + total_bayar);
    }
}

