package homeWork2.complexNumbers;

/**Реализовать класс, описывающий комплексное число (действительная и мнимая часть
 должны иметь точность double). Должны быть доступны следующие операции:
 1. Cоздание нового числа по действительной части (конструктор с 1
 параметром)
 2. Создание нового числа по действительной и мнимой части (конструктор
 с 2 параметрами)
 3. Сложение
 4. Вычитание
 5. Умножение
 6. Операция получения модуля
 7. преобразование в строку (toString)
 (арифметические действия должны создавать новый экземпляр класса)
 Написать код, демонстрирующий работу с созданными классами
 */

public class ComplexNumberTest {
    public static void main(String[] args) {
        ComplexNumbers cn1 = new ComplexNumbers(2.2);
        ComplexNumbers cn2 = new ComplexNumbers(7.4,5.1);
        ComplexNumbers cn3 = new ComplexNumbers(1.2, -1);

        System.out.println(cn1);
        System.out.println(cn2);
        System.out.println(cn3);

        ComplexNumbers cn4 = cn1.add(cn2);
        System.out.println(cn4);

        ComplexNumbers cn5 = cn2.subtract(cn3);
        System.out.println(cn5);

        ComplexNumbers cn6 = cn4.multiply(cn3);
        System.out.println(cn6);

        System.out.println(cn1.modul());
        System.out.println(cn2.modul());
        System.out.println(cn3.modul());
        System.out.println(cn4.modul());
        System.out.println(cn5.modul());
        System.out.println(cn6.modul());
    }
}
