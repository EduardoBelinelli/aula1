package entidades;

public class Exemplares {
	
	private int codigo;
	private String name;
	private int tipoExemplar;
	private int anoPublicacao;
	private int quantidade;
	
	
	
	public static void modificarQtd(int n) {
		
	}
	
	
	public void manterExemplares() {
		System.out.println(this.codigo + "\n" + this.name
				+ "\n" + this.tipoExemplar 
				+ "\n" + this.anoPublicacao 
				+ "\n" + this.quantidade );
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTipoExemplar() {
		return tipoExemplar;
	}
	public void setTipoExemplar(int tipoExemplar) {
		this.tipoExemplar = tipoExemplar;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
