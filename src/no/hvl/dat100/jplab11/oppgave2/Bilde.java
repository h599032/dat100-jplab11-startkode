package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	private String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super(id, bruker, dato, tekst);
		this.url =url;
		//throw new UnsupportedOperationException(TODO.constructor("Bilde"));
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id, bruker, dato, likes, tekst);
		this.url = url;
		//throw new UnsupportedOperationException(TODO.constructor("Bilde"));
	}
	
	public String getUrl() {
		return url;
		//throw new UnsupportedOperationException(TODO.method());

	}

	public void setUrl(String url) {
		this.url = url;
		//throw new UnsupportedOperationException(TODO.method());
	}

	@Override
	public String toString() {
		return "BILDE" + "\n" + super.id + "\n" + super.bruker + "\n" + super.dato + "\n" + super.likes + "\n" + super.getTekst() + "\n" + url + "\n";
		//throw new UnsupportedOperationException(TODO.method ());

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
