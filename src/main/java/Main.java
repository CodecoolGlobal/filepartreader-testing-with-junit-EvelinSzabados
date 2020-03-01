public class Main {

    public static void main(String[] args) {
        FilePartReader reader = new FilePartReader("src/main/resources/recipes.csv",1,2);
        FileWordAnalyzer analyzer = new FileWordAnalyzer(reader);
        System.out.println(analyzer.getWordsContainingSubstring("ze"));
    }
}
