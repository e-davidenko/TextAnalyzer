public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = this.maxLength;
    }
    @Override
    public String processText(String text) {
        return text.toString();
    }
}
