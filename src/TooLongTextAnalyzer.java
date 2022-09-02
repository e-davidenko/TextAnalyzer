import jdk.jfr.Label;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLenght;

    public TooLongTextAnalyzer(int MaxLenght) {
        this.maxLenght = maxLenght;
    }
    @Override
    public String processText(String text) {
        return text.toString();
    }
}
