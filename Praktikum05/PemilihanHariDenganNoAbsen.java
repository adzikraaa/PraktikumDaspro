package Praktikum05;
import java.util.Scanner;

public class PemilihanHariDenganNoAbsen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka (1-7): ");
        int angka = scanner.nextInt();

        String hari;

        switch (angka) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                hari = "Weekday";
                break;
            case 6:
            case 7:
                hari = "Weekend";
                break;
            default:
                hari = "Invalid Number";
        }

        System.out.println("Hari: " + hari);
    }
}