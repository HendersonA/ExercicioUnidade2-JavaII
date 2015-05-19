package Capacitacao;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		CursoCapacitacao cap = new CursoCapacitacao();
		
		Scanner sc = new Scanner(System.in);
		
		double media;
		String nome;
		int matricula = 0,esc=0,falta=0;
		
		do{	
		System.out.println("-------------MENU-------------\n");
		System.out.println("1-Incluir Aluno");
		System.out.println("2-Remover aluno");
		System.out.println("3-Verificar se o aluno está matriculado");
		System.out.println("4-Listar Alunos aprovados");
		System.out.println("5-Listar Alunos reprovados por falta");
		System.out.println("6-Listar por ordem Alfabética");
		System.out.println("7-Sair");
		Aluno aluno = null;
		esc = sc.nextInt();
		// Collections.sort((List<Aluno>) cap.alunoSet);
		switch(esc){
			case 1:	aluno = new Aluno();
					System.out.print("Nome: ");
					aluno.setNome(sc.next());					
					System.out.print("Média: ");
					aluno.setMatricula(matricula++);
					aluno.setMedia(sc.nextDouble());
					System.out.println("Falta: ");
					aluno.setFalta(sc.nextInt());
					cap.cadastrarAluno(aluno);
					System.out.println("Aluno cadastrado!");
					break;
					
			case 2: System.out.print("Nome: ");
					nome = sc.next();
					System.out.print("Matricula: ");
					matricula = sc.nextInt();	
					cap.removerAluno(nome, matricula);
					break;
			
			case 3: System.out.println("Matricula do aluno: ");
					aluno =	cap.mostrarAluno(sc.nextInt());
					if(aluno != null){
						System.out.println("Aluno contido na Lista!: " + aluno);
					}else{
						System.out.println("Aluno não contido na Lista!");
					}
					break;
				
			case 4: cap.listarAlunoAprovados();
					break;
					
			case 5: cap.listarPorFalta();
					break;
					
			case 6: cap.listarOrdemAlfa();
					break;
			case 7: System.exit(0);
				
		}
	  }while(esc!=4);
		
	}
}
