package homeWork1;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) throws Exception {
        int number = new Random().nextInt(99) + 1; // здесь загадывается число от 1 до 99
        int maxAttempts = 10; // здесь задается количество попыток
        System.out.println("Я загадал число от 1 до 99. У тебя " + maxAttempts + " попыток угадать.");
        // ваш код здесь
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < maxAttempts; i++) {
            int enteredNumber = scanner.nextInt();
            if (enteredNumber == number) {
                if (i < 6  && i > 1) {
                    System.out.println("Вы угадали число с "  + i + " попыток.");
                } else {
                    System.out.println("Вы угадали число с " + i + " попытки.");
                }
                return;
            } else if (enteredNumber > number) {
                if ((i + 1) < 6  || (i + 1) == 10) {
                    System.out.println("Мое число меньше! У тебя осталось " + (maxAttempts - i) + " попыток.");
                } else if ((i + 1) < 9) {
                    System.out.println("Мое число меньше! У тебя осталось " + (maxAttempts - i) + " попытки.");
                } else {
                    System.out.println("Мое число меньше! У тебя осталось " + (maxAttempts - i) + " попытка.");
                }
            } else {
                if ((i + 1) < 6  || (i + 1) == 10) {
                    System.out.println("Мое число больше! У тебя осталось " + (maxAttempts - i) + " попыток.");
                } else if ((i + 1) < 9) {
                    System.out.println("Мое число больше! У тебя осталось " + (maxAttempts - i) + " попытки.");
                } else {
                    System.out.println("Мое число больше! У тебя осталось " + (maxAttempts - i) + " попытка.");
                }
            }
        }
        System.out.println("Ты не угадал.");
    }
}
