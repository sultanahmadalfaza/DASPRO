import java.util.Scanner;

public class StudiKasus1_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        double totalHarga, diskon, totalBayar;
        double kembalian, kurang;

        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = input.nextInt();
        System.out.print("Masukkan jumlah bayar: ");
        uangBayar = input.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 0.1;
        }
        totalBayar = totalHarga - diskon;

        System.out.println("Total harga: " + totalHarga + ", diskon: " + diskon + ", total bayar: " + totalBayar);
    }
}
