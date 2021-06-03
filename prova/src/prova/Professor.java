package prova;

public class Professor implements Motivacao{
	public int AnoContratacao;
	public String drt;
	public double reputacao;
	public Pessoas Nome;
	public Pessoas AnoNascimento;
	
	@Override
	public void incentiva(double x) {
		setReputacao(getReputacao() + x);
	}

	
	
	public Professor() {
		this.reputacao = 0.0;
		this.drt = "111111";
		this.AnoContratacao = 2021;
	}
	
	

	public Professor(int AnoContratacao, String drt, double reputacao, Pessoas nome, Pessoas AnoNascimento) {
		this.AnoContratacao = AnoContratacao;
		this.drt = "111111";
		this.reputacao = 0.0;
		this.Nome = nome;
		this.AnoNascimento = AnoNascimento;
	}



	public int getAnoContratacao() {
		return AnoContratacao;
	}

	public void setAnoContratacao(int anoContratacao) {
		this.AnoContratacao = anoContratacao;
	}

	public String getDrt() {
		return drt;
	}

	public void setDrt(String drt) {
		this.drt = drt;
	}

	public double getReputacao() {
		return reputacao;
	}

	public void setReputacao(double reputacao) {
		this.reputacao = reputacao;
	}
	
}
