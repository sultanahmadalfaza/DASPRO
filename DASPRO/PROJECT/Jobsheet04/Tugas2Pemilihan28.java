import java.util.Scanner;

public class Tugas2Pemilihan28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah SKS: ");
        int jumlahSKS = sc.nextInt();

        if(jumlahSKS > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }
    }
}
