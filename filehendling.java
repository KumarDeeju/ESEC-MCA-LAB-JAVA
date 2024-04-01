import java.io.FileWriter;
import java.io.IOException;

public class filehendling {
    public static void main(String[] args) {
        String fileName = "selfCreat.txt";

        try(FileWriter writer = new FileWriter(fileName)) {
            
            writer.write("My first creation newfile. \n");
            for(int i=1;i<100;i++){
                writer.write("Sirdhiyon Unhe mubarak jinhe chhat par charhna ho meri manjil to aasma h. mujhe khud hi baana h. \n");
            }
            writer.flush();
            System.out.println("File writen Successfull. Go and check in the Folder \n");
        } catch (IOException e) {
            System.out.println("Exception occurred" + e.getMessage());
        }
    }
}
