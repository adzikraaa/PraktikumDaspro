
import java.util.Scanner;

public class GajiKaryawan10 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("...");
        System.out.println("Masukkan jumlah jam kerja: ");

        int jamKerja = sc.nextInt();
        System.out.println("Masukkan upah per jam ");

        double gajiPokok, bonus, totalGajiSebelumPajak, pajak, gajiBersih, upahPerJam;
        upahPerJam = sc.nextDouble();

        gajiPokok = jamKerja * upahPerJam;
        bonus = gajiPokok * 0.1;
        totalGajiSebelumPajak = gajiPokok + bonus;
        pajak = totalGajiSebelumPajak * 0.05;
        gajiBersih = totalGajiSebelumPajak - pajak;

        System.out.println("Gaji pokok: Rp " + gajiPokok);
        System.out.println("Bonus: Rp " + bonus);
        System.out.println("Total Gaji Sebelum Pajak: Rp " + totalGajiSebelumPajak);
        System.out.println("Pajak: Rp " + pajak);
        System.out.println("Gaji Bersih : Rp " + gajiBersih);
    }
}
