public class Main {

    public static boolean checkCredentials(String login, String password, String confirmPassword) {
        try {
            
            if (!login.matches("[a-zA-Z0-9_]+") || login.length() >= 20) {
                throw new WrongLoginException("Login must be less than 20 characters and contain only letters, digits, or underscore.");
            }

            
            if (!password.matches("[a-zA-Z0-9_]+") || password.length() >= 20) {
                throw new WrongPasswordException("Password must be less than 20 characters and contain only letters, digits, or underscore.");
            }

            
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Passwords do not match.");
            }

           
            return true;

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        
        boolean result = checkCredentials("Valid_Login123", "StrongPass_1", "StrongPass_1");
        System.out.println("Result: " + result);
    }
}
