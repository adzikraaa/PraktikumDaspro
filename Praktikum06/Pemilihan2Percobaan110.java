package Praktikum06;



import java.util.Scanner;

public class Pemilihan2Percobaan110 {
    public static void main(String[] args) {
       Scanner sc10 = new Scanner(System.in);

       
       System.out.print("Masukkan tahun: ");
       int tahun = sc10.nextInt();
       
       if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
            System.out.println("Tahun Kabisat");
        } else
            System.out.println("Bukan tahun kabisat" ); 


    }
}
