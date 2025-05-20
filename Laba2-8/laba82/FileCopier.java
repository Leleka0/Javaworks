import java.io.*;

public class FileCopier {

    

   
    public static void copyTextFile(String sourcePath, String destPath) {
        try (
            BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destPath))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); 
            }
            System.out.println("Текстовий файл скопійовано успішно.");
        } catch (IOException e) {
            System.out.println("Помилка при копіюванні текстового файлу: " + e.getMessage());
        }
    }

    
    public static void copyBinaryFile(String sourcePath, String destPath) {
        try (
            FileInputStream input = new FileInputStream(sourcePath);
            FileOutputStream output = new FileOutputStream(destPath)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
            System.out.println("Бiнарний файл скопiйовано успішно.");
        } catch (IOException e) {
            System.out.println("Помилка при копiюваннi бiнарного файлу: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
       
        String textSource = "example.txt";
        String textDest = "copy_example.txt";

        String imageSource = "image.jpg";
        String imageDest = "copy_image.jpg";

        
        copyTextFile(textSource, textDest);
        copyBinaryFile(imageSource, imageDest);
    }
}
