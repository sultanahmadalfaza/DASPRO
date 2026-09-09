import java.util.Scanner;

public class Tugas01_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double harga, dp, bunga = 0.02, sisaHarga, cicilanPokok, jumlahCicilan;
        int lamaCicilan;
        harga = input.nextDouble();
        dp = input.nextDouble();
        lamaCicilan = input.nextInt();
        sisaHarga = harga - dp;
        cicilanPokok = sisaHarga / lamaCicilan;
        jumlahCicilan = cicilanPokok + bunga * sisaHarga;
        System.out.println("Jumlah cicilan yang harus dibayar setiap bulan adalah Rp." + jumlahCicilan);
    }
}
