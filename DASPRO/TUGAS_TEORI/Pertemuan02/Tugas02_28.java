import java.util.Scanner;

/*
    Input: panjang tanah, lebar tanah, diameter kolam, panjang taman
    Output: sisa luas tanah
    Proses:
    1. Input panjang tanah, lebar tanah, diameter kolam, panjang taman
    2. Hitung luas tanah = panjang tanah * lebar tanah
    3. Hitung luas kolam = 3.14 * (diameter kolam / 2) * (diameter kolam / 2)
    4. Hitung luas taman = panjang taman * panjang taman
    5. Hitung sisa luas tanah = luas tanah - luas kolam - luas taman
    6. Output sisa luas tanah
*/
public class Tugas02_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float panjangTanah, lebarTanah, diameterKolam, panjangTaman, luasTanah, luasKolam, luasTaman, sisaLuasTanah;
        System.out.print("Masukkan panjang tanah: ");
        panjangTanah = input.nextFloat();
        System.out.print("Masukkan lebar tanah: ");
        lebarTanah = input.nextFloat();
        System.out.print("Masukkan diameter kolam: ");
        diameterKolam = input.nextFloat();
        System.out.print("Masukkan panjang taman: ");
        panjangTaman = input.nextFloat();

        luasTanah = panjangTanah * lebarTanah;
        luasKolam = 3.14f * (diameterKolam / 2) * (diameterKolam / 2);
        luasTaman = panjangTaman * panjangTaman;
        sisaLuasTanah = luasTanah - luasKolam - luasTaman;

        System.out.println("Sisa luas tanah: " + sisaLuasTanah);
    }
}
