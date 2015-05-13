package gestionesaune;

public class Prenotazione{
	private int posti;
	private String oraArrivo;
	private String oraUscita;
	
	public Prenotazione(int posti, String oraArrivo, String oraUscita){
		this.posti=posti;
		this.oraArrivo=oraArrivo;
		this.oraUscita=oraUscita;
	}

	public int getPosti(){
		return posti;
	}
	public String getOraArrivo(){
		return oraArrivo;
	}
	public String getOraUscita(){
		return oraUscita;
	}

	@Override
	public String toString() {
		return "Prenotazione [posti=" + posti + ", oraArrivo=" + oraArrivo + ", oraUscita=" + oraUscita + "]";
	}	
}