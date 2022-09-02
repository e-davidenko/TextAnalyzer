public class SpamAnalyzer implements TextAnalyzer{
    public String[] spamkeywords;

    public SpamAnalyzer(String[] spamkeywords) {
        this.spamkeywords = spamkeywords;
    }

    @Override
    public Label processText(String text) {
        return null;
    }
}