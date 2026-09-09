import java.util.Scanner;

public class MenghitungLuasPersegiPanjang28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, luas;
        panjang = input.nextInt();
        lebar = input.nextInt();
        luas = panjang*lebar;
        System.out.println("Luas persegi adalah " + luas);
        
    }
}
