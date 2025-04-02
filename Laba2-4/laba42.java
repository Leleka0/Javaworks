import java.util.Scanner;

public class laba42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 10; 
        int[] Arr = new int[num]; 
        
        
        for (int i = 0; i < num; i++) {
            Arr[i] = (int) (Math.random() * 20) - 6;
        }
        
       
        System.out.print("Масив: ");
        for (int value : Arr) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        
        int count = 0;
        for (int i = 1; i < num - 1; i++) {
            if (Arr[i] > Arr[i - 1] && Arr[i] > Arr[i + 1]) {
                count++;
            }
        }
        
        
        System.out.println("Кiлькiсть елементiв, бiльших за сусiдiв: " + count);
        
        in.close();
    }
}
