package pdfTEST;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class Test {

	private void chro() {
		System.out.println("Hello");

	}
	public static void main(String[] args) {
		
		try {
			File file = new File("ListofFraudulentWebsitesOctober2020_1602269801.pdf");  
			PDDocument document = PDDocument.load(file);
			PDFTextStripperByArea stripper = new PDFTextStripperByArea();
			stripper.setSortByPosition(true);
			Rectangle rect = new Rectangle(600,10,200,950);
			//Rectangle(x(largeNumberStartPoint),y(lessNumberStartPoint),Fix(width),Fix(height));
			stripper.addRegion("class1", rect);
			stripper.extractRegions(document.getPage(3));
			System.out.println(stripper.getTextForRegion("class1"));
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
}
