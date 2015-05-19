package Capacitacao;

public class Aluno implements Comparable<Aluno>{
	
	
	private String nome;
	private int matricula;
	private double media;
	private int falta;

	public int getFalta() {
		return falta;
	}
	public void setFalta(int falta) {
		this.falta = falta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", media="
				+ media + ", falta=" + falta + "]";
	}
	public int compareTo(Aluno a) {
		if(this.getMatricula()>a.getMatricula()){
			return 1;
		}
		if(this.getMatricula()<a.getMatricula()){
			return -1;
		}
		else{
			return 0;
		}
	}
}