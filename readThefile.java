import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readThefile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myFile = sc.nextLine();

        try (FileReader Iread = new FileReader(myFile)){
            int read;
            while ((read = Iread.read()) != -1) {
                System.out.print((char)read);
            }
        }catch(FileNotFoundException fl){
            System.out.println("Not found "+ myFile);
        }catch(IOException e){
            System.out.println("Exception Occurred "+ e.getMessage());
        }
    }
}
