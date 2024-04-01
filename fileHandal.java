import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fileHandal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name : ");
        String fileName = sc.nextLine();

        try(FileReader reader = new FileReader(fileName)){
            int read;
            while ((read = reader.read()) != -1) {
                System.out.print((char)read);
            }
        }catch(FileNotFoundException fe){
            System.out.println("not found "+ fileName);
        }catch(IOException e){
            System.out.println("Exception Occurred"+e.getMessage());
        }
    }
}
