import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class laba2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Цiна товару в 1-му магазинi: ");
        float p1 = Float.parseFloat(reader.readLine());

        System.out.print("Маса придбаного товару: ");
        float m1 = Float.parseFloat(reader.readLine());

        System.out.print("Цiна товару в 2-му магазинi: ");
        float p2 = Float.parseFloat(reader.readLine());

        System.out.print("Маса придбаного товару: ");
        float m2 = Float.parseFloat(reader.readLine());

        float s = p1 * m1 + p2 * m2;
        float p = s / (m1 + m2);

        System.out.println("Вартiсть придбаного товару: " + s + " грн.");
        System.out.println("Середня цiна за кiлограм: " + p + " грн.");
    }
}
