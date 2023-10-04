package files;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import javax.print.Doc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Document extends PDDocument{

    PDDocument document;
    String fileName;
    List<PDPage> pages;

    public Document(String fileName) {
        this.fileName = fileName;

        this.document = new PDDocument();
        this.pages = new ArrayList<>();
        pages.add(new PDPage());

        System.out.println("PDF created successfully.");
    }

    public void save() {
        try {
            document.save(fileName + ".pdf");
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addText(int pageNumber) throws IOException {
        PDPageContentStream contentStream = new PDPageContentStream(document, pages.get(pageNumber));

        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
        contentStream.beginText();
        contentStream.newLineAtOffset(100, 700);
        contentStream.showText("Hello, PDFBox!");
        contentStream.endText();

        contentStream.close();
    }
}
