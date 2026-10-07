import java.util.Scanner;

public class Latihan0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int suhu;
        String hujan;

        System.out.print("Masukkan suhu: ");
        suhu = input.nextInt();
        System.out.print("Apakah hujan (y atau n)? ");
        hujan = input.nextLine();
        if(suhu > 27) {
            System.out.println("Memakai dress");
            if(hujan.equals("y")) {
                System.out.println("Membawa payung");
            } else {
                System.out.println("Memakai sunscreen");
            }
        } else {
            System.out.println("Memakai celana panjang");
        }
    }
}
