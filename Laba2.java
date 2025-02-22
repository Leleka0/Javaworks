    import java.util.Scanner;
    
    public class Laba2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Введiть значення а: ");
            double alpha = scanner.nextDouble();
            
            double z1 = 2 * Math.pow(Math.sin(3 * Math.PI - 2 * alpha), 2) * Math.pow(Math.cos(5 * Math.PI + 2 * alpha), 2);
             
            double z2 = (1.0 / 4) - (1.0 / 4) * Math.sin((5.0 / 2) * Math.PI - 8 * alpha);
              
            System.out.println("z1 = " + z1);
            System.out.println("z2 = " + z2);
            
            scanner.close();
        }
    }
     
