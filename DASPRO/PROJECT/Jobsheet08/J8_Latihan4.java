import java.util.Scanner;

public class J8_Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalKeseluruhan = 0;
        System.out.print("Masukkan banyak produk: ");
        int banyakProduk = input.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = input.nextInt();
        int produk = 1; 
        while (produk <= banyakProduk) {
            int totalPerProduk = 0;
            double rata = 0;
            System.out.println("Produk " + produk + ": ");
            for (int hari = 1; hari <= jumlahHari; hari++) {
                int jumlah;
                do {
                    System.out.print("    Jumlah produk hari ke-" + hari + ": ");
                    jumlah = input.nextInt();
                } while (jumlah < 0);
                totalPerProduk += jumlah;
                rata += jumlah;
            }
            rata /= jumlahHari;
            System.out.println("Total penjualan produk " + produk + ": " + totalPerProduk + ", rata-rata: " + rata);
            totalKeseluruhan += totalPerProduk;
            produk++;
        }
        System.out.println("Total seluruh produk: " + totalKeseluruhan);
        input.close();
    }
}
