import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введiть логiн: ");
        String login = scanner.nextLine();

        System.out.print("Введiть пароль: ");
        String password = scanner.nextLine();

        System.out.print("Пiдтвердiть пароль: ");
        String confirmPassword = scanner.nextLine();

        boolean результат = checkCredentials(login, password, confirmPassword);
        System.out.println("Результат перевiрки: " + результат);

        scanner.close();
    }

    public static boolean checkCredentials(String login, String password, String confirmPassword) {
        try {
            if (!login.matches("[a-zA-Z0-9_]+") || login.length() >= 20) {
                throw new WrongLoginException("Логiн повинен мiстити тiльки латинськi лiтери, цифри або знак пiдкреслення i бути коротшим за 20 символiв.");
            }

            if (!password.matches("[a-zA-Z0-9_]+") || password.length() >= 20) {
                throw new WrongPasswordException("Пароль повинен мiстити тiльки латинськi лiтери, цифри або знак пiдкреслення i бути коротшим за 20 символiв.");
            }

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароль i пiдтвердження пароля не збiгаються.");
            }

            return true;

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Помилка: " + e.getMessage());
            return false;
        }
    }
}

