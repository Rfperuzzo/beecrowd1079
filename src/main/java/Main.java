
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 1, n;
        double n1, n2, n3, soma, media;

        n = scanner.nextInt();

        while (i <= n) {
            n1 = scanner.nextDouble();
            n2 = scanner.nextDouble();
            n3 = scanner.nextDouble();
            n1 = n1 * 2;
            n2 = n2 * 3;
            n3 = n3 * 5;
            soma = n1 + n2 + n3;
            media = soma / 10;
            System.out.printf("%.1f%n", media);
            i++;
        }

    }
}
