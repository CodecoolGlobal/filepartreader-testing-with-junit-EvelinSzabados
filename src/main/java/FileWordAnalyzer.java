import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileWordAnalyzer {

    FilePartReader reader;

    public FileWordAnalyzer(FilePartReader reader) {
        this.reader = reader;
    }

    public List getWordsOrderedAlphabetically() {
        String words = reader.readLines();
        List<Character> characterList = new ArrayList<Character>();
        for (int i = 0; i < words.length(); i++) {
            characterList.add(Character.toLowerCase(words.charAt(i)));

        }
        Collections.sort(characterList);

        return characterList;
    }

    public List getWordsContainingSubstring(String subString) {
        String fileContent = reader.readLines();
        List<String> wordsContainingSubstring = new ArrayList<String>();
        String[] words = fileContent.split("\\.");
        for (String word : words) {
            if (word.toLowerCase().contains(subString.toLowerCase())) {
                wordsContainingSubstring.add(word);
            }
        }
        return wordsContainingSubstring;
    }

    public List getStringsWhichPalindromes() {
        String fileContent = reader.readLines();
        List<String> palindromes = new ArrayList<String>();
        String[] words = fileContent.split("\\.");

        for (String word : words) {

            if (isPalindrome(word.toCharArray())) {
                palindromes.add(word);
            }

        }
        return palindromes;
    }

    public boolean isPalindrome(char[] word) {

        int i = 0;
        int j = word.length - 1;
        while (j > i) {
            if (word[i] != word[j]) {
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }
}