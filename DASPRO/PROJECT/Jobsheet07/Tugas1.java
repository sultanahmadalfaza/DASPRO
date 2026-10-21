import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahTiket, hargaPerTiket = 50000, totalHarga;

        while (true) {
            System.out.print("Masukkan jumlah tiket: ");
            jumlahTiket = input.nextInt();
            
            if (jumlahTiket < 0) {
                System.out.println("Masukan tidak valid");
                continue;
            }
            
            totalHarga = jumlahTiket * hargaPerTiket;
            if (jumlahTiket > 10) {
                totalHarga -= totalHarga * 15 / 100;
            } else if (jumlahTiket > 4) {
                totalHarga -= totalHarga * 10 / 100;
            }
            System.out.println("Total yang harus dibayar: Rp. " + totalHarga);
        }
    }
}
