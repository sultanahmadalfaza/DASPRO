public class J8_Latihan2 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'a';
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
