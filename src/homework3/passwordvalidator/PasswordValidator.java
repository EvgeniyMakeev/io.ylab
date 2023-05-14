package homework3.passwordvalidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        String login = "User_0123456789";
        String password = "pass_0123456789";
        String confirmPassword = "pass_0123456789";

        System.out.println(passwordValidator(login, password, confirmPassword));
    }

    private static final Pattern pattern = Pattern.compile("[\\w\\u005F]+");

    public static boolean passwordValidator(String login, String password, String confirmPassword) {
        try{
            Matcher matcherLogin = pattern.matcher(login);
            Matcher matcherPass = pattern.matcher(password);

            if (!matcherLogin.matches()) {
                throw new WrongLoginException("Логин содержит недопустимые символы");
            } else if (login.length() > 20) {
                throw new WrongLoginException("Логин слишком длинный");
            } else if (!matcherPass.matches()) {
                throw new WrongLoginException("Пароль содержит недопустимые символы");
            } else if (password.length() > 20) {
                throw new WrongPasswordException("Пароль слишком длинный");
            } else if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароль и подтверждение не совпадают");
            }
        }
        catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
