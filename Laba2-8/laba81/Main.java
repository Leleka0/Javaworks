public class Main {

    public static boolean checkCredentials(String login, String password, String confirmPassword) {
        try {
            
            if (!login.matches("[a-zA-Z0-9_]+") || login.length() >= 20) {
                throw new WrongLoginException("Логін повинен містити тільки латинські літери, цифри або знак підкреслення і бути коротшим за 20 символів..");
            }

            
            if (!password.matches("[a-zA-Z0-9_]+") || password.length() >= 20) {
                throw new WrongPasswordException("Пароль повинен містити тільки латинські літери, цифри або знак підкреслення і бути коротшим за 20 символів.");
            }

            
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароль і підтвердження пароля не збігаються.");
            }

           
            return true;

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Помилка: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        
        boolean result = checkCredentials("Valid_Login123", "StrongPass_1", "StrongPass_1");
        System.out.println("Result: " + result);
    }
}
