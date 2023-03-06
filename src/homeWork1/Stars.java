package homeWork1;

import java.util.Scanner;

/** Программе передается 3 параметра:
 * количество строк, количество столбцов,
 * произвольный симов. Необходимо вывести фигуру,
 * состоящую из заданного списка строк и заданного количества столбцов,
 * и каждый элемент в которой равен указанному символу.

 Ввод: n m c
 Вывод: фигура
**/

 public class Stars {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String template = scanner.next();
            String[][] stars = new String[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    stars[i][j] = template;
                    System.out.print(stars[i][j]);
                }
                System.out.println();
            }
        }
    }
}
