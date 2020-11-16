package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	private Innlegg[] tabell;
	private int antall;
	// TODO: objektvariable 

	public Blogg() {
		antall=0;
		tabell=new Innlegg[20];
	}

	public Blogg(int lengde) {
		tabell=new Innlegg[lengde];
		this.antall=0;
	
	}

	public int getAntall() {
		return antall;
	}
	
	public Innlegg[] getSamling() {
		return tabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		boolean found=false;
		int pos=0;
		while(pos<antall && !found) {
			if (tabell[pos].erLik(innlegg)) {
				found=true;
			}
			else {
				pos++;
			}
		}
		if(found) {
			return pos;
		}
		else return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean found=false;
		int pos=0;
		while(pos<antall && !found) {
			if (tabell[pos].erLik(innlegg)) {
				found=true;
			}
			else {
				pos++;
			}
		}
		return found;
	}

	public boolean ledigPlass() {
		
		if(antall<getSamling().length) 
			return true;
		
		else return false;

	}
	
	public boolean leggTil(Innlegg innlegg) {
		if(!ledigPlass() || finnes(innlegg)) {
			return false;
		}
		else {
		tabell[antall]=innlegg;
		antall++;
		return true;
		}
	}
	
	public String toString() {
		String str;
		str=antall+"\n";
		for(int i = 0; i<antall; i++) {
			str+=tabell[i].toString();
		}
		return str;
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