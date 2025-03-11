import java.util.Scanner;

public class Laba22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Введiть a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Введiть b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Введiть d: ");
        double d = scanner.nextDouble();
        
        
        double x;
        if (b < 0) {
            x = Math.pow(a, 5) + b;
        } else if (b >= 0 && b < 1.5 && a != b) {
            x = (Math.pow(a, 2) + (a / (a - b))) / (Math.pow(a, 2) + a - b);
        } else if (b >= 1.5 && b < 2.5) {
            x = Math.pow(a, 3) + b * Math.pow(a, 2) + Math.pow(b, 2);
        } else {
            x = Math.pow(a, 4);
        }
        
        
        double y;
        if (x > 2.3) {
            y = 2.3;
        } else {
            y = d - (Math.pow(x, 2) / 2);
        }
        
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        scanner.close();
    }
}

