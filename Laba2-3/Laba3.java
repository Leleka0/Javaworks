public class Laba3 {
    public static void main(String[] args) {
        double c = -1.0;
        double alpha = Math.toRadians(30);
        double ha = 0.25 * c;

        if (ha < 0) {
            ha = -ha;
        }

        double bestA = 0;

        double a = c;

        double sinAlphaSquared = Math.pow(Math.sin(alpha), 2);
        double maxY = a / Math.log(sinAlphaSquared); 
        bestA = a; 
        
        a += ha;

        while (a <= 0) {
            sinAlphaSquared = Math.pow(Math.sin(alpha), 2);
            if (sinAlphaSquared > 0) {
                double y = a / Math.log(sinAlphaSquared);
                System.out.println("a = " + a + "  y = " + y);

                if (y > maxY) {
                    maxY = y;
                    bestA = a;
                }
            } else {
                System.out.println("Помилка: некоректне значення під логарифмом");
            }

            a += ha;
        }

        System.out.println("Максимальне y: " + maxY + " при a = " + bestA);
    }
}

