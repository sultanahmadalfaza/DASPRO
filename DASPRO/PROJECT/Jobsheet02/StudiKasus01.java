import java.util.Scanner;

public class StudiKasus01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float gajiPokok, tunjanganAnak, simpanan = 0.1f, gajiBersih;
        int jumlahAnak;
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = input.nextFloat();
        System.out.print("Masukkan tunjangan anak: ");
        tunjanganAnak = input.nextFloat();
        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = input.nextInt();

        gajiBersih = gajiPokok + (tunjanganAnak * jumlahAnak) - (gajiPokok * simpanan);
        System.out.println("Gaji bersih: " + gajiBersih);
    }
}
