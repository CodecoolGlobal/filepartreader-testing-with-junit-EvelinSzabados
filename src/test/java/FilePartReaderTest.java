import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class FilePartReaderTest {
    @Test
    public void testReader(){
        final FilePartReader reader = new FilePartReader("src/main/resources/recipes.csv",1,5);
        Assertions.assertNotNull(reader.read());

    }
    @Test
    public void testReadLines(){
        FilePartReader reader = new FilePartReader("src/main/resources/recipes.csv",1,5);
        Assertions.assertNotNull(reader.readLines());


    }
}