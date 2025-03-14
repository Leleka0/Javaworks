public class Laba31 {
    public static void main(String[] args) {
        double a = 1.0;  
        double b = 1.0;  
        double T = 5.0;  
        double hx = 0.2;

        boolean firstIteration = true;
        double maxY = 0;
        double maxX = 0;

        for (double x = 0; x <= T; x += hx) {
            double z = Math.pow(x, 4) + a * x + Math.pow(b, 3);
            double y = Math.pow(Math.cos(z + a), 3) - x;

            if (firstIteration || y > maxY) {
                maxY = y;
                maxX = x;
                firstIteration = false;
            }
        }

        System.out.println("Максимальне значення y: " + maxY + " при x = " + maxX);
    }
}

