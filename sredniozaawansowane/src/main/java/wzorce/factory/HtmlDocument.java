package wzorce.factory;

public class HtmlDocument extends Document {
    public HtmlDocument(String text, DocumentGenerator.DocumentType type) {
        super(String.format("<h1>%s</h1>", formatText(text)), type);
    }

    private static String formatText (String text) {
        return text.replaceAll("\r\n", "<br/>");
    }
}
