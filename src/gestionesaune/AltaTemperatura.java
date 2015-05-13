package gestionesaune;

public class AltaTemperatura extends Sauna{
	private double costo;

	public AltaTemperatura(double costo, String numero, int capienza){
		super(numero, capienza);
		this.costo=costo;
	}

	public double getCosto(){
		return costo;
	}
}