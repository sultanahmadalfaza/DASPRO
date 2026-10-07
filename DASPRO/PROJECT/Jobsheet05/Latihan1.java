import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bil1, bil2, bil3, max;

        System.out.print("Masukkan bilangan 1: ");
        bil1 = input.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        bil2 = input.nextInt();
        System.out.print("Masukkan bilangan 3: ");
        bil3 = input.nextInt();
        
        max = bil1;
        if (bil2 > bil1) {
            if (bil2 > bil3) {
                max = bil2;
            }
        }
        if (bil3 > bil1) {
            if (bil3 > bil2) {
                max = bil3;
            }
        }
        System.out.println("Bilangan terbesar: " + max);
    }
}
