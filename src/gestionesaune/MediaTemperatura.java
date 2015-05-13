package gestionesaune;

public class MediaTemperatura extends Sauna{
	private double costo;

	public MediaTemperatura(double costo, String numero, int capienza){
		super(numero, capienza);		
		this.costo=costo;
	}

	public double getCosto(){
		return costo;
	}
}