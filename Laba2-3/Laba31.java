public class Laba31 {
    public static void main(String[] args) {
        double a = 1.0;  // Задайте значення a
        double b = 1.0;  // Задайте значення b
        double T = 5.0;  // Задайте верхню межу x
        double hx = 0.2;

        double maxY = Double.NEGATIVE_INFINITY;
        double maxX = 0;

        for (double x = 0; x <= T; x += hx) {
            double z = Math.pow(x, 4) + a * x + Math.pow(b, 3);
            double y = Math.pow(Math.cos(z + a), 3) - x;

            if (y > maxY) {
                maxY = y;
                maxX = x;
            }
        }

        System.out.printf("Максимальне значення y: %.6f при x = %.6f\n", maxY, maxX);
    }
}
