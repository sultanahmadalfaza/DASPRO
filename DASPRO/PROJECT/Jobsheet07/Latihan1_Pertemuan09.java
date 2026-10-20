import java.util.Scanner;

public class Latihan1_Pertemuan09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jamBelajar, totalBelajar = 0;

        for (int hari = 1; hari <= 7; hari++) {
            System.out.print("Masukkan jam belajar hari ke-" + hari + ": ");
            jamBelajar = sc.nextInt();
            while (jamBelajar > 10) {
                System.out.print("Jam belajar tidak memungkinkan, masukkan kembali jam belajar hari ke-" + hari + ": ");
                jamBelajar = sc.nextInt();
            }
            totalBelajar += jamBelajar;
        }
        System.out.println("Total jam belajar adalah: " + totalBelajar);
        sc.close();
    }
}
