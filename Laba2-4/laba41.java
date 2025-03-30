import java.util.Scanner;

public class laba41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num = 10;
        int[] Arr = new int[num];

        
        System.out.print("Масив: ");
        for (int i = 0; i < num; i++) {
            Arr[i] = (int) (Math.random() * 20) - 6;
            System.out.print(Arr[i] + " ");
        }
        System.out.println();

       
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < num; i++) {
            if (Arr[i] < Arr[minIndex]) minIndex = i;
            if (Arr[i] > Arr[maxIndex]) maxIndex = i;
        }
        
        System.out.println("Мiнiмальний елемент: " + Arr[minIndex]);
        System.out.println("Максимальний елемент: " + Arr[maxIndex]);
        
       
        int[] newArr = new int[num - 2];
        int j = 0;
        for (int i = 0; i < num; i++) {
            if (i != minIndex && i != maxIndex) {
                newArr[j++] = Arr[i];
            }
        }


        System.out.print("Оновлений масив: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }
}
