public class Persona{
	private String nome;
	private int eta;
	//costruttore
	public Persona(String nome, int eta){
		setNome(nome);
		setEta(eta);
	}
	//setter/getter
	public int getEta(){
		return eta;
	}
	private void setEta(int e){
		eta=e;
	}
	public String getNome(){
		return nome;
	}
	private void setNome(String n){
		nome=n;
	}
}