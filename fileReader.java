import java.io.FileReader;
import java.io.IOException;

public class fileReader {   
    public static void main(String[] args) {
        String fileName = "selfCreat.txt";

        try (FileReader reader = new FileReader(fileName)) {
            int read = 0;
            do {
                read = reader.read();
                System.out.print((char)read);

            } while (read != -1);

        } catch (IOException e) {
            System.out.println("Exception Occurred." + e.getMessage());
        }
    }
}
