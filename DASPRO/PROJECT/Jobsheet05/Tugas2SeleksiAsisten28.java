import java.util.Scanner;

public class Tugas2SeleksiAsisten28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        int nilaiDasarPemrograman;
        boolean memilikiSertifikatKopetensi;
        int nilaiWawancara;

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah mahasiswa sedang disanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();
        System.out.print("Masukkan nilai Dasar Pemrograman: ");
        nilaiDasarPemrograman = sc.nextInt();
        System.out.print("Apakah memiliki sertifikat kompetensi? (true/false): ");
        memilikiSertifikatKopetensi = sc.nextBoolean();
        
        if (mahasiswaAktif && sedangDisanksi) {
            if (nilaiDasarPemrograman >= 80 || memilikiSertifikatKopetensi) {
                System.out.print("Masukkan nilai wawancara: ");
                nilaiWawancara = sc.nextInt();
                if (nilaiWawancara >= 75) {
                    System.out.println("Mahasiswa diterima sebagai asisten praktikum");
                } else {
                    System.out.println("Seleksi gagal: nilai wawancara harus minimal 75");
                }
            } else {
                System.out.println("Seleksi gagal: nilai dasar pemrograman harus minimal 80 atau memiliki sertifikat kompetensi pemrograman");
            }
        } else {
            System.out.println("Seleksi gagal: status mahasiswa tidak memenuhi syarat");
        }
    }
}
