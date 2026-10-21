import java.util.Scanner;

public class Latihan1_Pertemuan09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jamBelajar, totalBelajar = 0;

        int hari = 1;
        while (hari <= 7) {
            System.out.print("Masukkan jam belajar hari ke-" + hari + ": ");
            jamBelajar = sc.nextInt();
            if (jamBelajar > 10) {
                System.out.println("Jam belajar tidak memungkinkan");
                continue;
            }
            totalBelajar += jamBelajar;
            hari++;
        }
        System.out.println("Total jam belajar adalah: " + totalBelajar);
        sc.close();
    }
}
