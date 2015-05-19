package inventario;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Inventario in = new Inventario();
		Scanner scanner = new Scanner(System.in);
		
		int esc =0,cod;
		String desc;
		
		while(esc!=6){
			System.out.println("----------MENU----------\n");
			System.out.println("1-Cadastrar item");
			System.out.println("2-Mostrar itens");
			System.out.println("3-Buscar um item(Contido)");
			System.out.println("4-Verificar itens(Vazio)");
			System.out.println("5-Ordenação dos itens");
			System.out.println("6-Sair");
			esc = scanner.nextInt();
			switch(esc){
				case 1:	Item item1 = new Item();
						System.out.print("Digite o Codigo: ");
						cod = scanner.nextInt();
						item1.setCodigo(cod);
						System.out.print("Digite uma descricao: ");
						desc = scanner.next();
						item1.setDescricao(desc);
						in.cadastrar(item1);
						break;
						
				case 2:	in.mostrar();
						break;
						
				case 3:	in.buscar(in.item1);
						break;
						
				case 4:	in.verificar();
						break;
						
				case 5:	in.ordenar(in.item1);
						break;
					
				case 6:System.exit(0);
						break;
			}
			Collections.sort((List<Item>) in.getItens());
		}			
	}
}