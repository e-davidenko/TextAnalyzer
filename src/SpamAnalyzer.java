public class SpamAnalyzer implements TextAnalyzer{
    public String[] spamkeywords;

    public SpamAnalyzer(String[] spamkeywords) {
        this.spamkeywords = spamkeywords;
    }

    @Override
    public String processText(String text) {
        return null;
    }
}