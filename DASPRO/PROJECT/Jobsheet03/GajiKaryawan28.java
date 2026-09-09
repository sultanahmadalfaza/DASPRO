import java.util.Scanner;

public class GajiKaryawan28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gajiPokok;
        double bonus, totalGaji;
        double tunjanganTransportasi = 600000;
        double tunjanganMakan = 400000;
        gajiPokok = input.nextInt();
        bonus = 0.05 * gajiPokok;
        totalGaji = gajiPokok + tunjanganTransportasi + tunjanganMakan + bonus - (0.1*gajiPokok);
        System.out.println("Bonus bulanan Anda adalah Rp." + bonus);
        System.out.println("Gaji yang diterima adalah Rp." + (int) totalGaji);
    }
}
