//Дано текст. Видалити всі входження th
public class laba62 {
    public static void main(String[] args) {
       
        String text = "The thunderstorm that threatened the valley throughout the day finally faded. Those who had gathered in the theatre thanked their luck, thinking the thunder would ruin the thrilling theme night.";

        
        String result = text.replaceAll("th", "");

        
        System.out.println("Текст пiсля видалення 'th': " + result);
    }
}
