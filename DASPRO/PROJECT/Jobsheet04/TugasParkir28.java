import java.util.Scanner;

public class TugasParkir28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lamaParkir, tarifParkir;

        lamaParkir = input.nextInt();
        if(lamaParkir <= 2) {
            tarifParkir = 2000;
        } else {
            tarifParkir = 1000 * lamaParkir;
            System.out.println("Tarif parkir: Rp. " + tarifParkir);
        }
    }
}
