import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessEditor {

    public static void main(String[] args) {
        String filePath = "products.txt"; 

        try (RandomAccessFile raf = new RandomAccessFile(filePath, "rw")) {

            
            raf.seek(0); 
            String newProduct1 = "НОВИЙ_ТОВАР_ПОЧАТОК\n";
            insertText(raf, newProduct1);

            
            long middle = raf.length() / 2;
            raf.seek(middle);
            String newProduct2 = "\nНОВИЙ_ТОВАР_СЕРЕДИНА\n";
            insertText(raf, newProduct2);

            
            raf.seek(raf.length());
            String newProduct3 = "НОВИЙ_ТОВАР_КIНЕЦЬ\n";
            raf.write(newProduct3.getBytes());

            System.out.println("Успiшно дописано товари в рiзнi мiсця файлу.");

        } catch (IOException e) {
            System.out.println("Помилка при роботi з файлом: " + e.getMessage());
        }
    }

    
    private static void insertText(RandomAccessFile raf, String text) throws IOException {
        long insertPos = raf.getFilePointer();
        byte[] remaining = new byte[(int)(raf.length() - insertPos)];
        raf.readFully(remaining);

        raf.seek(insertPos);
        raf.write(text.getBytes());     
        raf.write(remaining);          
    }
}

