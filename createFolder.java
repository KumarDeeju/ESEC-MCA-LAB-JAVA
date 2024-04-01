import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class createFolder {
    public static void main(String[] args) {
        String fileName = "myFile.txt";

        try(FileWriter writer = new FileWriter(fileName)){
                writer.write("File is Created \n");
            for(int i=1;i<10;i++){
                writer.write("this is the myFile. \n");
            }
            writer.flush();
                System.out.println("Creating a file");
        }catch(FileNotFoundException fe){
            System.out.println("Not creat "+ fe.getMessage());
        }catch(IOException e){
            System.out.println("Exception Occurred"+ e.getMessage());
        }
    }
}
