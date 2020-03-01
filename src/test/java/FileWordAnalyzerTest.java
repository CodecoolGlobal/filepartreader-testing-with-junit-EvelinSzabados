import jdk.internal.org.objectweb.asm.tree.analysis.Analyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileWordAnalyzerTest {
    FilePartReader reader = new FilePartReader("src/main/resources/recipes.csv", 1, 2);
    FileWordAnalyzer analyzer = new FileWordAnalyzer(reader);

    @Test
    public void testGetWordsOrderedAlphabetically() {

        List<Character> result = analyzer.getWordsOrderedAlphabetically();
        List<Character> test = new ArrayList<Character>(Arrays.asList('e', 'f', 'i', 'o', 'r', 'r', 's', 't', 'z'));

        assertEquals(test,result);
    }

    @Test
    public void testGetWordsContainingSubstring() {
        List<String> result = analyzer.getWordsContainingSubstring("ze");
        List<String> test = new ArrayList<String>(Arrays.asList("Zero"));

        assertEquals(test,result);

    }

    @Test
    public void testGetStringsWhichPalindromes() {
        List<String> result = analyzer.getStringsWhichPalindromes();
        List<String> test = new ArrayList<String>(Arrays.asList("abba"));
        assertEquals(test,result);
    }

}