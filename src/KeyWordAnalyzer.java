public abstract class KeyWordAnalyzer implements TextAnalyzer {
    abstract protected String[] getKeywords();

    protected abstract Label getLabel();

    public Label processText(String text) {
        for (String keyword : getKeywords()) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}