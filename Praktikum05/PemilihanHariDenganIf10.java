public class PemilihanHariDenganIf10 {
    public static void main(String[] args) {
        int hari;
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Masukkan nomor hari (1-7): ");
        hari = input.nextInt();

        if (hari >= 1 && hari <= 5) 
        {
            System.out.println("Weekday");
        } 
        else if (hari == 6 || hari == 7) 
        {
            System.out.println("Weekend");
        } 
        else 
        {
            System.out.println("Invalid Number");
        }
    }
}