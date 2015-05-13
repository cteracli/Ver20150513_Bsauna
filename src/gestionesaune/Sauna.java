package gestionesaune;

import java.util.Vector; 

public class Sauna{
	private String numero;
	private int capienza;
	private int sauneTotali;
	private Vector<Prenotazione> prenotazioni;
	
	public Sauna(String numero, int capienza){
		this.numero=numero;
		this.capienza=capienza;
		prenotazioni=new Vector<Prenotazione>(1,1);
	}

	public String getNumero(){
		return numero;
	}
	public int getCapienza(){
		return capienza;
	}
	
    public int getSauneDisponibili(){
		return this.sauneTotali-prenotazioni.size();
	}
    
	public void addPrenotazione(Prenotazione p) throws Exception{
		if(sauneTotali>0){
		prenotazioni.addElement(p);
		}else{
			throw new Exception("Non ci sono saune disponibili");
			}
		}

	@Override
	public String toString() {
		return "Sauna [numero=" + numero + ", capienza=" + capienza + ", sauneTotali=" + sauneTotali + "]";
	}
}