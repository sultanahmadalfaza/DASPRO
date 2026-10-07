import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String hari;
        String jenisBuku;
        int jumlahBuku;
        int diskon = 0;

        System.out.print("Masukkan hari: ");
        hari = input.nextLine();
        System.out.print("Masukkan jenis buku: ");
        jenisBuku = input.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = input.nextInt();

        if (hari.equalsIgnoreCase("rabu")) {
            if (jenisBuku.equalsIgnoreCase("kamus")) {
                if (jumlahBuku > 2) {
                    diskon = 12;
                } else {
                    diskon = 10;
                }
            } else if (jenisBuku.equalsIgnoreCase("novel")) {
                if (jumlahBuku > 3) {
                    diskon = 9;
                } else {
                    diskon = 8;
                }
            } else if (jumlahBuku > 3) {
                diskon = 5;
            }
        }
        System.out.println("Diskon buku: " + diskon + "%");
    }
}
