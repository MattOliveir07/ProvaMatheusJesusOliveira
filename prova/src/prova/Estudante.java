package prova;

public abstract class Estudante implements Motivacao{
	public double mediaGeral;
	public String RA;
	public Pessoas nome;
	public Pessoas anoNascimento;
	
	@Override
	public void incentiva(double x) {
		setMediaGeral(getMediaGeral() + x);
	}
	
	public Estudante() {
		super();
	}

	
	public Estudante(double mediaGeral, String rA, Pessoas nome, Pessoas anoNascimento) {
		super();
		this.mediaGeral = mediaGeral;
		RA = rA;
		this.nome = nome;
		this.anoNascimento = anoNascimento;
	}

	public double getMediaGeral() {
		return mediaGeral;
	}

	public void setMediaGeral(double mediaGeral) {
		this.mediaGeral = mediaGeral;
	}

	public String getRA() {
		return RA;
	}

	public void setRA(String rA) {
		RA = rA;
	}
	
	
		
	
}	
