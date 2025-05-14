//Дано текст. Видалити всі входження th
public class laba62 {
    public static void main(String[] args) {
       
        String text = "The thunderstorm that threatened the valley throughout the day finally faded.";

        
        String result = text.replaceAll("th", "");

        
        System.out.println("Текст пiсля видалення 'th': " + result);
    }
}
