import java.util.Scanner;

public class bebekUntukTeman_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, A, B;

        n = sc.nextInt();
        m = sc.nextInt();

        A = n / m;
        B = n % m;

        System.out.println("masing-masing " + A);
        System.out.println("bersisa " + B);
    }
}
