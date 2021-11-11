package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable
	private Innlegg[] innleggtabell;
	private int nesteledige;

	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteledige = 0;
		// throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledige = 0;
		// throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public int getAntall() {
		return nesteledige;
		// throw new UnsupportedOperationException(TODO.method());
	}

	public Innlegg[] getSamling() {
		return innleggtabell;
		// throw new UnsupportedOperationException(TODO.method());

	}

	public int finnInnlegg(Innlegg innlegg) {
		boolean finn = false;
		int pos = 0;
		while (!finn && pos < nesteledige) {
			if (innleggtabell[pos].erLik(innlegg)) {
				finn = true;
			} else
				pos++;
		}
		if (finn) {
			return pos;
		} else
			return -1;
		// throw new UnsupportedOperationException(TODO.method());
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnes = false;
		int pos = 0;
		while (!finnes && pos < nesteledige) {
			if (innleggtabell[pos].erLik(innlegg)) {
				finnes = true;
			} else
				pos++;
		} return finnes;
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		return nesteledige < innleggtabell.length && innleggtabell[nesteledige] == null;
		//throw new UnsupportedOperationException(TODO.method());

	}

	public boolean leggTil(Innlegg innlegg) {
		boolean leggtil = finnes(innlegg);
		if(!leggtil) {
			innleggtabell[nesteledige] = innlegg;
			nesteledige++;
			leggtil = true;
		}
		return leggtil;
		//throw new UnsupportedOperationException(TODO.method());
	}

	public String toString() {
		String tabell = "";
		for(int i = 0; i < nesteledige; i++) {
			tabell += innleggtabell[i].toString();
			
		} return nesteledige + "\n" + tabell;
		//throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}