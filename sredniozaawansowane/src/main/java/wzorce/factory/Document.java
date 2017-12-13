package wzorce.factory;


import wzorce.factory.DocumentGenerator.DocumentType;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Document {
    private DocumentType type;
    private String text;

    public Document(String myText, DocumentType type) {
        this.type = type;
        this.text = myText;
    }

    public String getText() {
        return text;
    }

    public void saveFile() {
        String path = "D:/";
        String fileName = ("my_own_file");
        String outputPath = String.format("%s%s%s", path, fileName, type.getExtension());
        System.out.println("Plik zostanie zapisany w: " + outputPath);
        System.out.println("Tekst do zapisania: " + text);

        try {
            File file = new File(outputPath);
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(text);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
