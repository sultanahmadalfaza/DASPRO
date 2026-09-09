import java.util.Scanner;

public class MenghitungTotalBayar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double harga;
        double potongan, jumlahBayar, diskon = 0.15;
        harga = input.nextDouble();
        potongan = diskon * harga;
        jumlahBayar = harga - potongan;
        System.out.println("Jumlah yang harus Anda bayar adalah Rp." + jumlahBayar);

    }
}
