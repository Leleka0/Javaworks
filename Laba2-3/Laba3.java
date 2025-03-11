import java.util.Locale;

public class Laba3 {
    public static void main(String[] args) {
       
        double c = -1.0;
        
        double alpha = Math.toRadians(45);
        
        double ha = 0.25 * c;

        
        if (ha < 0) {
            ha = -ha;
        }

        
        double maxY = Double.NEGATIVE_INFINITY;
        double bestA = 0;

       

        
        double a = c;
        while (a <= 0) {
            
            double sinAlphaSquared = Math.pow(Math.sin(alpha), 2);
            if (sinAlphaSquared > 0) {
                double y = a / Math.log(sinAlphaSquared);
                System.out.printf(Locale.US, "a = %.4f  y = %.6f\n", a, y);

                
                if (y > maxY) {
                    maxY = y;
                    bestA = a;
                }
            } else {
                System.out.println("Помилка: некоректне значення під логарифмом");
            }

            
            a += ha;
        }
       
        System.out.printf(Locale.US, "Максимальне y: %.6f при a = %.4f\n", maxY, bestA);
    }
}
