package homeWork2.sequences;

public class SequencesImpl implements Sequences{

    @Override
    public void a(int n) {
        int baseNumber = 0;
        System.out.print("A: ");
        for (int i = 1; i <= n; i++) {
            baseNumber += 2;
            if (i != n) System.out.print(baseNumber + ", ");
            else System.out.println(baseNumber + "...");
        }
    }

    @Override
    public void b(int n) {
        int baseNumber = 1;
        System.out.print("B: ");
        for (int i = 1; i <= n; i++) {
            if (i != n) System.out.print(baseNumber + ", ");
            else System.out.println(baseNumber + "...");
            baseNumber += 2;
        }
    }

    @Override
    public void c(int n) {
        System.out.print("C: ");
        for (int i = 1; i <= n; i++) {
            if (i != n) System.out.print((i * i) + ", ");
            else System.out.println((i * i) + "...");
        }
    }

    @Override
    public void d(int n) {
        System.out.print("D: ");
        for (int i = 1; i <= n; i++) {
            if (i != n) System.out.print((i * i * i) + ", ");
            else System.out.println((i * i * i) + "...");
        }
    }

    @Override
    public void e(int n) {
        int baseNumber = 1;
        System.out.print("E: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) System.out.print(baseNumber);
            else System.out.print((-baseNumber));
            if (i < n) System.out.print(", ");
            else System.out.println("...");
        }
    }

    @Override
    public void f(int n) {
        System.out.print("F: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) System.out.print(i);
            else System.out.print(-i);
            if (i < n) System.out.print(", ");
            else System.out.println("...");
        }
    }

    @Override
    public void g(int n) {
        System.out.print("G: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                if (i != n) System.out.print((i * i) + ", ");
                else System.out.println((i * i) + "...");
            } else {
                if (i != n) System.out.print(-(i * i) + ", ");
                else System.out.println(-(i * i) + "...");
            }
        }
    }

    @Override
    public void h(int n) {
        int baseNumber = 1;
        System.out.print("H: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) System.out.print(baseNumber++);
            else System.out.print(0);
            if (i < n) System.out.print(", ");
            else System.out.println("...");
        }
    }

    @Override
    public void i(int n) {
        int lastNumber = 1;
        System.out.print("I: ");
        for (int i = 1; i <= n; i++) {
            if (i != n) System.out.print((lastNumber * i) + ", ");
            else System.out.println((lastNumber * i) + "...");
            lastNumber *= i;
        }
    }

    @Override
    public void j(int n) {
        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber;
        System.out.print("J: ");
        for (int i = 1; i <= n; i++) {
            if (i < n){
                if (i > 2) {
                    thirdNumber = firstNumber + secondNumber;
                    System.out.print(thirdNumber + ", ");
                    firstNumber = secondNumber;
                    secondNumber = thirdNumber;
                } else {
                    System.out.print(firstNumber + ", ");
                }
            } else {
                if (i > 2) {
                    thirdNumber = firstNumber + secondNumber;
                    System.out.print(thirdNumber + "...");
                    firstNumber = secondNumber;
                    secondNumber = thirdNumber;
                } else {
                    System.out.print(firstNumber + "...");
                }
            }
        }
    }
}
