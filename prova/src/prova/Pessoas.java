package prova;

public class Pessoas {
	public int AnoNascimento;
	public String Nome;
	
	
	
	public Pessoas() {
		this.Nome = "Não identiciado";
		this.AnoNascimento = 1900;
	}
	
	
	public Pessoas(int AnoNascimento, String nome) {
		super();
		this.AnoNascimento = AnoNascimento;
		this.Nome = nome;
	}
	public int getAnoNascimento() {
		return AnoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.AnoNascimento = anoNascimento;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	
}
