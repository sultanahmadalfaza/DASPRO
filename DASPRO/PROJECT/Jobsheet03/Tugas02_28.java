import java.util.Scanner;

public class Tugas02_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahLembar, totalBiaya;
        jumlahLembar = input.nextInt();
        totalBiaya = jumlahLembar * 500 + 5000;
        System.out.println("Total biaya yang harus dibayar adalah Rp." + totalBiaya);
    }
}
