import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.IOException;

public class WritingTextFiles {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Files/SomeText.txt");
        try(BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("Hello Java Developers");
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        System.out.println("File written successfully");
    }
}