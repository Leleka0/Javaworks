import java.util.Scanner;

public class laba42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 10; 
        double[] Arr = new double[num];
        
        
        for (int i = 0; i < num; i++) {
            Arr[i] = Math.random() * 20 - 10;
        }
        
        
        System.out.print("Масив: ");
        for (double value : Arr) {
            System.out.printf("%.2f ", value);
        }
        System.out.println();
        
       
        int count = 0;
        for (int i = 1; i < num - 1; i++) {
            if (Arr[i] > Arr[i - 1] && Arr[i] > Arr[i + 1]) {
                count++;
            }
        }
        
        
        System.out.println("Кількість елементів, більших за сусідів: " + count);
        
        in.close();
    }
}
