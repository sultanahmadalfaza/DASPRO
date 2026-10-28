public class J8_Latihan3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.print("n = " + i + " -> jumlah kuadrat = ");
            int jumlah = 0;
            for (int j = 1; j <= i; j++) {
                jumlah += j*j;
                if (i == 1) {
                    break;
                }
                System.out.print(j*j);
                if (j < i) {
                    System.out.print(" + ");
                } else {
                    System.out.print(" = ");
                }
            }
            System.out.println(jumlah);
        }
    }
}
