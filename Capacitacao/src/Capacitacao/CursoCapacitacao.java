package Capacitacao;

import java.util.HashSet;
import java.util.Set;

public class CursoCapacitacao {

	Set<Aluno> alunoSet = new HashSet<>();
	
	private int id;
	private String nome;
	
	public int getId() {
		return id;
		}
	public void setId(int id) {
		this.id = id;
		}
	public String getNome() {
		return nome;
		}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void listarPorFalta(){
		for(Aluno setAluno: alunoSet){
			if(setAluno.getFalta()>=15){
				System.out.println("Aluno: "+setAluno.getNome());
			}
		}
	}
	public void listarAlunoAprovados(){
		for(Aluno setAluno: alunoSet){
			setAluno.compareTo(setAluno);
			if(setAluno.getMedia()>=7)
			System.out.println("Aluno: "+ setAluno.getNome() + " Matricula: " + setAluno.getMatricula());
		}	
	}
	public void listarOrdemAlfa(){
		for(Aluno aluno: alunoSet){
			aluno.compareTo(aluno);
			System.out.println(aluno.getNome());
		}
	}
	public Aluno getAlunos(){
		for(Aluno aluno1: alunoSet){
			return aluno1;
		}
		return alunoSet.iterator().next();		
	}
	public void cadastrarAluno(Aluno aluno){
		alunoSet.add(aluno);
	}
	public void removerAluno(String nome, int matricula){	
		for(Aluno aluno : alunoSet){
			if(matricula == aluno.getMatricula()){
				alunoSet.remove(aluno);
			}
		}
	}
	public Aluno mostrarAluno(int matricula){
				for(Aluno aluno: alunoSet){
				if(matricula == aluno.getMatricula()){
					return aluno;
				}else{
					return null;
				}
					/*System.out.println("Aluno contido na Lista!: "+aluno.getNome());*/
			}
				return  null;
		}
	}
