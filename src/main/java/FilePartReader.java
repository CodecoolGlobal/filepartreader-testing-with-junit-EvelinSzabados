import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilePartReader {

    String filePath;
    int fromLine;
    int toLine;

    public FilePartReader(String filePath,int fromLine,int toLine){
        this.filePath = filePath;
        if(fromLine <1 || toLine<fromLine){
            throw new IllegalArgumentException("Invalid numbers");
        }else{
            this.fromLine = fromLine;
            this.toLine = toLine;
        }

    }

    public String read (){
        StringBuilder fileContent = new StringBuilder();

        File file = new File(filePath);

        try {
            Scanner sc = new Scanner(file, "UTF-8");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                fileContent.append(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + ex.getMessage());
        }
        return fileContent.toString();

    }
    public String readLines (){
        String fileContent = read();
        String[] lines = fileContent.split(".");
        StringBuilder resultLines = new StringBuilder();
        for(int i = fromLine-1; i<toLine-1; i++){
            resultLines.append(lines[i]);
        }

        return resultLines.toString();
    }
}
