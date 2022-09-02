public class NegativeTextAnalyzer implements TextAnalyzer {
    String text;

    public NegativeTextAnalyzer() {

    }

    public String NegativeTextAnalyzer(String test) {
        if (text.contains(this.text)) {
            return "A";
        } else return "B";
    }

    @Override
    public String processText(String text) {
        return null;
    }
}

