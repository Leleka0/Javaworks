import java.util.Locale;

public class Laba3 {
    public static void main(String[] args) {
        // Задане значення c (від'ємне)
        double c = -1.0;
        // Кут α у градусах, переводимо в радіани
        double alpha = Math.toRadians(30);
        // Крок h_a, беремо за модулем, щоб був додатний
        double ha = 0.25 * c;

        // Перевіряємо, щоб крок був додатний
        if (ha < 0) {
            ha = -ha;
        }

        // Максимальне значення y та відповідне a
        double maxY = Double.NEGATIVE_INFINITY;
        double bestA = 0;

       

        // Цикл від c до 0 з кроком h_a
        double a = c;
        while (a <= 0) {
            // Обчислюємо y
            double sinAlphaSquared = Math.pow(Math.sin(alpha), 2);
            if (sinAlphaSquared > 0) {
                double y = a / Math.log(sinAlphaSquared);
                System.out.printf(Locale.US, "a = %.4f  y = %.6f\n", a, y);

                // Перевіряємо, чи це максимальне значення
                if (y > maxY) {
                    maxY = y;
                    bestA = a;
                }
            } else {
                System.out.println("Помилка: некоректне значення під логарифмом");
            }

            // Збільшуємо a
            a += ha;
        }

        System.out.println("==========================");
        System.out.printf(Locale.US, "Максимальне y: %.6f при a = %.4f\n", maxY, bestA);
    }
}
