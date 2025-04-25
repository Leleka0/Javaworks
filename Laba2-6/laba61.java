public class laba61 {
    public static void main(String[] args) {
        String input = "А роза впала на лапу Азора";
        
        
        input = input.replaceAll("\\s+", "").toLowerCase();
        
        
        if (isPalindrome(input)) {
            System.out.println("Рядок є паліндромом.");
        } else {
            System.out.println("Рядок не є паліндромом.");
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
