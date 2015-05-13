package gestionesaune;

public class Cliente{
	private String nome;
	private String cognome;
	private String email;
	private String codice;
	
	public Cliente(String nome, String cognome, String email, String codice){
		this.nome=nome;
		this.cognome=cognome;
		this.email=email;
		this.codice=codice;
	}

	public String getNome(){
		return nome;
	}
	public String getCognome(){
		return cognome;
	}
	public String getEmail(){
		return email;
	}
	public String getCodice(){
		return codice;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", codice=" + codice + "]";
	}	
}