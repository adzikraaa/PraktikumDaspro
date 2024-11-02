package Praktikum08;

public class BintangA10 {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*"); // Menggunakan print tanpa ln untuk cetak horizontal
            }
            System.out.println(); // Pindah ke baris baru setelah setiap baris bintang
        }
    }
}
