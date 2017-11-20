package pl.sda.wzorce.factory;

import static pl.sda.wzorce.factory.DocumentGenerator.DocumentType.HTML;
import static pl.sda.wzorce.factory.DocumentGenerator.DocumentType.TXT;

public class DocumentGenerator {


    public Document createDocument(String myText, DocumentType type) {
        Document document;
        switch (type) {
            case TXT:
                document = new TxtDocument(myText, TXT);
                break;
            case HTML:
                document = new HtmlDocument(myText, HTML);
                break;
            default:
                document = null;
                break;
        }
        return document;
    }

    public enum DocumentType {
        TXT(".txt"), HTML(".html");
        private String extension;

        DocumentType(String e) {
            extension = e;
        }

        public String getExtension() {
            return extension;
        }
    }
}
