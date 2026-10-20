import java.util.Scanner;

public class Latihan2_Pertemuan09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jamKerja, gajiHarian, bonus;

        while (true) {
            System.out.print("Masukkan jam kerja: ");
            jamKerja = sc.nextInt();
            if (jamKerja < 0) {
                break;
            }
            
            System.out.print("Masukkan gaji harian: ");
            gajiHarian = sc.nextInt();

            if (jamKerja > 8) {
                bonus = gajiHarian / 5;
            } else {
                bonus = 0;
            }
            System.out.println("Bonus: " + bonus);
        }

        sc.close();
    }
}
