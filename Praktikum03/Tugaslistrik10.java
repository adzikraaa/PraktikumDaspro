import java.util.Scanner;

public class Tugaslistrik10 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        double tarifListrik, penggunaanListrik, totalTagihan, listrikLebih;

        tarifListrik = 1500;
        listrikLebih = 500;

        System.out.println("Masukkan jumlah penggunaan listrik (kWh)");
        penggunaanListrik = sc.nextDouble();

        totalTagihan = penggunaanListrik + tarifListrik;
        System.out.println("Berikut merupakan tagihan listrik anda : " + totalTagihan);

        System.out.println("Apakah listrik lebih dari 500 kWh?: " + (listrikLebih < penggunaanListrik));
    }
}
