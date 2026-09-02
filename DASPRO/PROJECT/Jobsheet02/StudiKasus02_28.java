import java.util.Scanner;

public class StudiKasus02 {
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
