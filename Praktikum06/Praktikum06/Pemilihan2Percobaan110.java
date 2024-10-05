package Praktikum06;



import java.util.Scanner;

public class Pemilihan2Percobaan110 {
    public static void main(String[] args) {
       Scanner sc10 = new Scanner(System.in);

       
       System.out.print("Masukkan tahun: ");
       int tahun = sc10.nextInt();
       
       if ((tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0) {
        System.out.println(tahun + " adalah tahun kabisat.");
    } else {
        System.out.println(tahun + " bukan tahun kabisat.");
    }


    }
}
