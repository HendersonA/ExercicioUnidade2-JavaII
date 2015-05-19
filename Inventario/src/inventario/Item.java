package inventario;

public class Item implements Comparable{
		
	private int codigo;
	private String descricao;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "descricao:"+getDescricao() +
				"\n codigo:"+getCodigo();
	}
	//Onde usar o método compareTo?
	public int compareTo(Object obj) {
		Item i = (Item)obj; 
		if(this.codigo < i.codigo){
			return -1;
		}
		if(this.codigo > i.codigo){
			return 1;
		}
		return 0;
	}
 }