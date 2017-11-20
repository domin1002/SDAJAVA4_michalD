package pl.sda.wzorce.factory;

import pl.sda.wzorce.factory.DocumentGenerator.DocumentType;

public class TxtDocument extends Document {
    public TxtDocument(String myText, DocumentType type) {
        super(myText, type);
    }

}
