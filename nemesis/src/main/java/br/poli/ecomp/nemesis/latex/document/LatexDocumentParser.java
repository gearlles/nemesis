package br.poli.ecomp.nemesis.latex.document;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class LatexDocumentParser {
	
	private String template;
	private final String TEMPLATE_FILE_NAME = "template.tex";
	private final String HEADER_TOKEN = "HEADER";
	private final String BODY_TOKEN = "BODY";
	private final String FOOTER_TOKEN = "FOOTER";

	public LatexDocumentParser() {
		this.template = getStringFromInputStream(ClassLoader
				.getSystemResourceAsStream(TEMPLATE_FILE_NAME));
		Velocity.init();
	} 
	
	public String replaceHeader(String header) {
		return replace(HEADER_TOKEN, header, template);
	}
	
	public String replaceBody(String body) {
		return replace(BODY_TOKEN, body, template);
	}
	
	public String replaceFooter(String footer) {
		return replace(FOOTER_TOKEN, footer, template);
	}
	
	public String replaceAll(String header, String body, String footer) {
		String _header = replace(HEADER_TOKEN, header, template);
		String _body = replace(BODY_TOKEN, body, _header);
		String _footer = replace(FOOTER_TOKEN, footer, _body);
		return _footer;
	}
	
	private String replace(String token, String value, String template) {
		VelocityContext context = new VelocityContext();
		context.put(token, value);
		
		StringWriter writer = new StringWriter();
        Velocity.evaluate(context, writer, "LatexTemplate", template);
        
        return writer.toString();
	}
	
	private static String getStringFromInputStream(InputStream is) {

		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();

		String line;
		try {

			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return sb.toString();

	}

}
