import java.util.Scanner;

public class Kasus01_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float panjang, lebar, keliling;
        System.out.print("Masukkan panjang: ");
        panjang = input.nextFloat();
        System.out.print("Masukkan lebar: ");
        lebar = input.nextFloat();

        keliling = 2 * (panjang + lebar);
        System.out.println("Hasil keliling: " + keliling);
    }
}
