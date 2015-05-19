package inventario;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Inventario{
	 private  Collection<Item> itens = new ArrayList<>();
	 Item item1 = new Item();
	   
	 	public void cadastrar(Item item){
	 		itens.add(item);

	 	}
		public void buscar(Item item){
				
			if(itens.size()>0){
				System.out.println("Contém na lista");
			}else{
				System.out.println("Não contém na lista");
			}
	  }
		public void ordenar(Item item){
			for(Item itens : itens){
				System.out.println(itens.getCodigo() +":"+ itens.getDescricao());
			}
		}
		public void mostrar(){
			for (Item i : itens) {
				System.out.println(i);
			}
		}
		public Collection<Item> getItens(){
			return this.itens;
		}
		public void verificar(){
			for (Item item2 : itens){
				if(itens.isEmpty()){
					System.out.println("Está vazia!");
				}else{
				System.out.println("Não está vazia!");
			}
		}
	}
}