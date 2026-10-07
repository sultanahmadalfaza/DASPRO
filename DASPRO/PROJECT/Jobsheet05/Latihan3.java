import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String merek, kategori;
        int harga, ukuran, minUkuran, maxUkuran;

        System.out.print("Masukkan merek sepatu: ");
        merek = input.nextLine();
        System.out.print("Masukkan kategori sepatu: ");
        kategori = input.nextLine();
        System.out.print("Masukkan ukuran sepatu: ");
        ukuran = input.nextInt();
        
        if (merek.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip On")) {
                harga = 800000;
                minUkuran = 36;
                maxUkuran = 40;
            } else {
                harga = 1200000;
                minUkuran = 40;
                maxUkuran = 44;
            }
        } else if (merek.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                harga = 1000000;
                minUkuran = 36;
                maxUkuran = 41;
            } else {
                harga = 1800000;
                minUkuran = 41;
                maxUkuran = 44;
            }
        } else {
            if (kategori.equalsIgnoreCase("Kids")) {
                harga = 750000;
                minUkuran = 36;
                maxUkuran = 40;
            } else {
                harga = 1500000;
                minUkuran = 40;
                maxUkuran = 44;
            }
        }
        if (ukuran >= minUkuran) {
            if (ukuran <= maxUkuran) {
                System.out.println("Harga sepatu: " + harga);
            } else {
                System.out.println("Ukuran sepatu tidak tersedia");
            }
        } else {
            System.out.println("Ukuran sepatu tidak tersedia");
        }
        input.close();
    }
}
