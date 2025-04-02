public class Laba31 {
    public static void main(String[] args) {
        double a = 1.0;  
        double b = 1.0;  
        double T = 5.0;  
        double hx = 0.2;

        double x = 0; 
        double z = Math.pow(x, 4) + a * x + Math.pow(b, 3);
        double maxY = Math.pow(Math.cos(z + a), 3) - x; 
        double maxX = x;

        for (x += hx; x <= T; x += hx) { 
            z = Math.pow(x, 4) + a * x + Math.pow(b, 3);
            double y = Math.pow(Math.cos(z + a), 3) - x;

            if (y > maxY) {
                maxY = y;
                maxX = x;
            }
        }

        System.out.println("Максимальне значення y: " + maxY + " при x = " + maxX);
    }
}

