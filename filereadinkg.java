import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class filereadinkg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the file which you want to read:");
        String fileNameis = sc.nextLine();

        try(FileReader reader = new FileReader(fileNameis)){
            int read = 0;
            do{
               read = reader.read();
               System.out.print((char)read);
            }while(read != -1);
        }catch(IOException e){
            System.out.println("Exception Occurred" + e.getMessage());
        }
    }
}
