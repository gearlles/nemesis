package br.poli.ecomp.nemesis.latex.pdf;

import java.io.File;
import java.io.IOException;

import de.nixosoft.jlr.JLRGenerator;

/**
 * Converte um arquivo .tex em um PDF.
 *
 */
public class PDFGenerator {

	private File pdfLatexFile = new File(
			"C:\\Program Files (x86)\\MiKTeX 2.9\\miktex\\bin\\pdflatex.exe");
	private File texFile = new File(
			"C:\\Users\\gearl_000\\Desktop\\tutorial\\test.tex");
	private File outputFolder = new File(
			"C:\\Users\\gearl_000\\Desktop\\tutorial");
	
	public PDFGenerator(File pdfLatexFile, File texFile, File outputFolder) {
		this.pdfLatexFile = pdfLatexFile;
		this.texFile = texFile;
		this.outputFolder = outputFolder;
	}
	
	public boolean generate() {
        try {
            JLRGenerator pdfGen = new JLRGenerator();  
            
			if (!pdfGen.generate(pdfLatexFile, texFile, outputFolder, outputFolder)) { 
			    System.out.println(pdfGen.getErrorMessage());
			} else {
				pdfGen.deleteTempFiles(false, true, true);
			}
			System.out.println(pdfGen.getOutputStream());
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}
