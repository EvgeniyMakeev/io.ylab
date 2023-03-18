package homeWork2.snilsValidator;

public class SnilsValidatorTest {
    public static void main(String[] args) {
        System.out.println(new SnilsValidatorImpl().validate("01468870570"));
        System.out.println(new SnilsValidatorImpl().validate("0114404441"));
        System.out.println(new SnilsValidatorImpl().validate("901144044481"));
        System.out.println(new SnilsValidatorImpl().validate("9 0114404441"));
        System.out.println(new SnilsValidatorImpl().validate("d0114404441"));
        System.out.println(new SnilsValidatorImpl().validate("90814404441"));
        System.out.println(new SnilsValidatorImpl().validate("08336732477"));
    }
}
