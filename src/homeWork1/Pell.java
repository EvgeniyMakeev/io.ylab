package homeWork1;

import java.util.Scanner;

public class Pell {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int p0 = 0;
            int p1 = 1;
            int pN = 0;
            for (int i = 0; i < n; i++) {
                pN = p1 + (2 * p0);
                p1 = p0;
                p0 = pN;
            }
            System.out.print(pN);
        }
    }
}
