import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class laba1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Як вас звати? ");
        String userName = reader.readLine();
        System.out.println("WhatsApp, " + userName + "!");

        int now = 2025;
        System.out.print("Скiльки вам рокiв? ");
        int age = Integer.parseInt(reader.readLine());

        System.out.println("Ви народилися у " + (now - age) + " роцi.");
    }
}
    

