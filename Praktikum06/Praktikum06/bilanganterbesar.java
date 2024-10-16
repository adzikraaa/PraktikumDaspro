package Praktikum06;

import java.util.Scanner;

public class bilanganterbesar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int bilangan1, bilangan2, bilangan3, terbesar;

        System.out.print("Masukkan bilangan1: ");
        bilangan1 = sc.nextInt();

        System.out.print("Masukkan bilangan2: ");
        bilangan2 = sc.nextInt();

        System.out.print("Masukkan bilangan3: ");
        bilangan3 = sc.nextInt();

        if (bilangan1 > bilangan2) {
            terbesar = bilangan1;
        }
        else if (bilangan2 > bilangan3) {
            terbesar = bilangan2;
        }
        else 
        terbesar = bilangan3;
        System.out.println("Nilai terbesar : " + terbesar);



        



        
    }
}
