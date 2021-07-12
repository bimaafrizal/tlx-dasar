import java.util.Scanner;

public class luasSegitiga_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, T;
        double luas;

        A = sc.nextInt();
        T = sc.nextInt();

        luas = 0.5 * A * T;
        System.out.printf("%.2f", luas);
    }
}
