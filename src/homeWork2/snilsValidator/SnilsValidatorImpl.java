package homeWork2.snilsValidator;

public class SnilsValidatorImpl implements SnilsValidator{
    @Override
    public boolean validate(String snils) {
        boolean result = false;

        if (snils == null) {
            System.out.println("СНИЛС пуст");
        } else if (isNotDigit(snils)) {
            System.out.println("СНИЛС может состоять только из цифр");
        } else if (snils.length() != 11) {
            System.out.println("СНИЛС может состоять только из 11 цифр");
        } else {
            int sum = 0;
            for (int i = 0; i < 9; i++) {
                sum += Integer.parseInt(String.valueOf(snils.charAt(i))) * (9 - i);
            }
            int checkDigit = 0;
            if (sum < 100) {
                checkDigit = sum;
            } else if (sum > 101) {
                checkDigit = sum % 101;
                if (checkDigit == 100) {
                    checkDigit = 0;
                }
            }
            if (checkDigit == Integer.parseInt(snils.substring(snils.length() - 2))) {
                result = true;
            } else {
                System.out.println("Неправильное контрольное число.");
            }
        }
        return result;
    }

    private boolean isNotDigit(String snils) {
        for (int i = 0; i < snils.length(); i++) {
            if (!Character.isDigit(snils.charAt(i))) return true;
        }
        return false;
    }
}
