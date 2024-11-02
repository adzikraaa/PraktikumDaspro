package Praktikum08;
public class BintangB10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // Loop untuk baris
            for (int j = 1; j <= i; j++) { // Loop untuk jumlah bintang di setiap baris
                System.out.print("*");
            }
            System.out.println(" "); // Pindah ke baris berikutnya setelah mencetak semua bintang di baris tersebut
        }
    }
}
