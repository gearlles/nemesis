package br.poli.ecomp.nemesis;

import java.io.FileInputStream;
import java.io.IOException;

import java_cup.internal_error;
import java_cup.runtime.Symbol;
import br.poli.ecomp.nemesis.avaliador.ALexico;
import br.poli.ecomp.nemesis.avaliador.parser;

public class Main {

	public static void main(String[] args) throws internal_error, IOException, Exception {
		ALexico lex = new ALexico(new FileInputStream("C:\\Users\\Felipe\\git2\\nemesis\\nemesis\\src\\main\\resources\\doc\\mockup.nm"));
		parser p = new parser(lex);
		Symbol program = p.parse();
		
	}
}
