package Performance;


import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Teste {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iniciando...");
		
		Set<Integer> teste = new LinkedHashSet<>();
		Set<Integer> teste2 = new TreeSet();
	
		int esc=0;
		while(esc!=3){
		System.out.println("----------MENU----------\n");
		System.out.println("1-LinkedHashSet, TreeSet");
		System.out.println("2-Sair");
		esc = scanner.nextInt();
		
		switch(esc){
		 
		case 1:		System.out.println("TreeSet:");
	 				retornar(teste2);
			 		System.out.println("LinkedHashSet:");
			 		retornar(teste);
			 		break;
			 		
		 case 2:	System.exit(0);
		 			break;
		}
	  }
	}
	public static void retornar(Set<Integer> t){
		long inicio = System.currentTimeMillis();
		int total = 30000;
		for(int i=0;i<total;i++){
			t.add(i);
		}
		for(int i=0;i<total;i++){
			t.contains(i);
		}
		long fim = System.currentTimeMillis();
		long tempo = fim-inicio;
		
		System.out.println("Tempo gasto: " + tempo);
	}
}