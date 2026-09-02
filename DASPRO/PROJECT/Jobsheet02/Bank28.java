import java.util.Scanner;

public class Bank28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float tabunganAwal, bunga = 0.02f, tabunganAkhir;
        System.out.print("Masukkan jumlah tabungan awal anda: ");
        tabunganAwal = input.nextFloat();
        tabunganAkhir = tabunganAwal * (1 + bunga);
        tabunganAkhir = tabunganAkhir * (1 + bunga);
        tabunganAkhir = tabunganAkhir * (1 + bunga);
        tabunganAkhir = tabunganAkhir * (1 + bunga);
        tabunganAkhir = tabunganAkhir * (1 + bunga);
        System.out.println("Total bunga selama 5 tahun: " + (tabunganAkhir - tabunganAwal));
        System.out.println("Tabungan akhir selama 5 tahun: " + tabunganAkhir);
    }
}
