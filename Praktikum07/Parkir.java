package Praktikum07;

import java.util.Scanner;

public class Parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int jenis, durasi, total = 0;
        int tarifParkir = 0;

        do {
        System.out.println("Pilih jenis kendaraan sesuai nomor:");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("0. Tidak valid, keluar");
        System.out.println("----------------------");
        System.out.println("Masukkan nomor jenis kendaraan: ");
        jenis = sc.nextInt();

        if (jenis == 0){
            System.out.println("tidak valid");
            break;
        }

        System.out.println("Masukkan lama durasi parkir ... jam ");
        durasi = sc.nextInt();

        
        if (durasi > 5){
            total += 12500;
        }
        else if (jenis == 1){
            total += durasi * 3000;
        }
        else if (jenis == 2){
                total =+ durasi * 2000;
        }
        System.out.println("Total biaya parkir adalah: Rp." + total);
        
        } while (jenis != 0);
        
    }
}
