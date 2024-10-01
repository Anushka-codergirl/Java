/**
 *
 * @author Anushka
 */
import java.io.*;
import java.nio.charset.StandardCharsets;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;

@ManagedBean(name="fileUploadBean")
@ViewScoped
public class FileUploadBean implements Serializable {

    private Part file;

    // Getter and Setter for the file
    public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;
    }

    // Method to handle file upload and conversion
    public void processFile() {
        if (file != null) {
            try {
                // Save the uploaded file temporarily
                String tempFilePath = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/") + "temp.csv";
                File tempFile = new File(tempFilePath);

                // Write the uploaded file to the temp file
                try (InputStream input = file.getInputStream();
                     FileOutputStream output = new FileOutputStream(tempFile)) {
                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = input.read(buffer)) != -1) {
                        output.write(buffer, 0, bytesRead);
                    }
                }

                // Path to the output file (without BOM)
                String outputFilePath = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/") + "converted_utf8.csv";

                // Convert the file from UTF-8 BOM to UTF-8
                convertUTF8BOMToUTF8(tempFilePath, outputFilePath);

                // Inform the user that the file was processed successfully
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("File converted and saved successfully as UTF-8!"));

            } catch (IOException e) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "File processing error", e.getMessage()));
            }
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "No file selected", ""));
        }
    }

    // Method to convert a CSV file from UTF-8 BOM to UTF-8
    public void convertUTF8BOMToUTF8(String inputFilePath, String outputFilePath) {
        try (
            // Reader to read the source file with UTF-8 encoding
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(inputFilePath), StandardCharsets.UTF_8));
            
            // Writer to write the new file in UTF-8 without BOM
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream(outputFilePath), StandardCharsets.UTF_8));
        ) {
            // Detect BOM (0xEF, 0xBB, 0xBF) and skip if present
            reader.mark(3);
            if (reader.read() != 0xEF || reader.read() != 0xBB || reader.read() != 0xBF) {
                // No BOM detected, reset the reader to start from the beginning
                reader.reset();
            }

            // Read and copy the content line by line
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("[^\\x20-\\x7E]", " "); // Removes non-printable characters    
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File conversion from UTF-8 BOM to UTF-8 completed successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}