//Визначити, чи є заданий рядок паліндромом (приклад паліндрома: «Ароза упала на лапу Азора»)
public class laba61 {
    public static void main(String[] args) {
        String input = "Три психи пили Пилипихи спирт";
        
        
        input = input.replaceAll("\\s+", "").toLowerCase();
        
        
        if (isPalindrome(input)) {
            System.out.println("Рядок є палiндромом.");
        } else {
            System.out.println("Рядок не є палiндромом.");
        }
    }

    
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
