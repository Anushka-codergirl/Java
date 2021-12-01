import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author ASUS
 */
public class ReadingFiles {
    public static void main(String[] args) throws IOException{
        Path path = Paths.get("Files/SomeText.txt");
        boolean exists = Files.exists(path);
        System.out.println("Exists = " + exists);
        try(BufferedReader reader = Files.newBufferedReader(path);){
            String line =  reader.readLine();
            while(line!=null){
                System.out.println("Line = " + line);
                line =  reader.readLine();
            }
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
