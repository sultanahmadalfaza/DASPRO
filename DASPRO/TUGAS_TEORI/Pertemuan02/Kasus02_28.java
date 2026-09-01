import java.util.Scanner;

public class Kasus02_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float tabunganAwal, bunga = 0.02f, tabunganAkhir;
        System.out.print("Masukkan tabungan awal: ");
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
