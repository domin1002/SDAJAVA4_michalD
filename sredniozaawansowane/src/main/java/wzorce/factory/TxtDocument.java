package wzorce.factory;

import wzorce.factory.DocumentGenerator.DocumentType;

public class TxtDocument extends Document {
    public TxtDocument(String myText, DocumentType type) {
        super(myText, type);
    }

}
