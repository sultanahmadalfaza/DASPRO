import java.util.Scanner;

public class TugasAntrean28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kodeLayanan;
        kodeLayanan = sc.nextInt();

        switch (kodeLayanan) {
            case 1:
                System.out.println("Legalisir Ijazah, Loket A");
                break;
            case 2:
                System.out.println("Surat Keterangan Aktif Kuliah, Loket B");
                break;
            case 3:
                System.out.println("Pembayaran UKT, Loket C");
                break;
            case 4:
                System.out.println("Pembayaran Cuti Akademik, Loket D");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
                break;
        }
    }
}
