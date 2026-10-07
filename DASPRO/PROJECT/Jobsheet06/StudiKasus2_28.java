import java.util.Scanner;

public class StudiKasus2_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, statusPendanaan;

        System.out.print("Nama mahasiswa: ");
        nama = input.nextLine();
        System.out.print("Jenis kegiatan: ");
        jenisKegiatan = input.nextLine();
        System.out.print("Jumlah dokumen yang diupload: ");
        jumlahDokumen = input.nextInt();

        if (jumlahDokumen < 4) {
            System.out.println("Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.");

        } else if (jenisKegiatan.equalsIgnoreCase("Lainnya")) {
            System.out.println("Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status Pendanaan PKM: ");
            statusPendanaan = input.nextInt();

            if (statusPendanaan == 1) {
                System.out.println("Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
            } else {
                System.out.println("Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan)");
            }

        } else {
            System.out.print("Peringkat juara: ");
            peringkatJuara = input.nextInt();
            
            if (peringkatJuara == 0) {
                System.out.println("Tidak memperoleh dana penghargaan (hanya untuk juara 1/2/3).");
            } else {
                System.out.println("Berhak memperoleh dana penghargaan (mendapat juara 1/2/3). ");
            }

        }
    }
}
