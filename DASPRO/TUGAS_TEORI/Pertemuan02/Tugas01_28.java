import java.util.Scanner;

/*
    Input: gaji pokok, besar tunjangan anak, simpanan, jumlah anak
    Output: gaji bersih
    Proses:
    1. Input gaji pokok, besar tunjangan anak, simpanan, jumlah anak
    2. Hitung gaji bersih = gaji pokok + (tunjangan anak * jumlah anak) - simpanan
    3. Output gaji bersih
*/

public class Tugas01_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float gajiPokok, tunjanganAnak = 100000, simpanan = 0.1f, gajiBersih;
        int jumlahAnak;
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = input.nextFloat();
        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = input.nextInt();

        gajiBersih = gajiPokok + (tunjanganAnak * jumlahAnak) - (gajiPokok * simpanan);
        System.out.println("Gaji bersih: " + gajiBersih);
    }
}
