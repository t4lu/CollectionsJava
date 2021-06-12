package ExerciciosCollection;

public class Estoque implements Funcoes{

	private String calcados;
	private String camisetas;
	private String jeans;
	private String vestidos;

	public Estoque() {
		super();
	}
	public Estoque(String string, int i) {
}
	public String getCalcados() {
		return calcados;
	}
	public void setCalcados(String calcados) {
		this.calcados = calcados;
	}
	public String getCamisetas() {
		return camisetas;
	}
	public void setCamisetas(String camisetas) {
		this.camisetas = camisetas;
	}
	public String getJeans() {
		return jeans;
	}
	public void setJeans(String jeans) {
		this.jeans = jeans;
	}
	public String getVestidos() {
		return vestidos;
	}
	public void setVestidos(String vestidos) {
		this.vestidos = vestidos;
	}
	public String toString() {
	return "Itens em estoque: " + this.calcados + ", " + this.camisetas + this.jeans + this.vestidos;
	}
	public void guardarDados(String e) {
		
	}
	public void deletarDados(String e) {
		
	}

	public void atualizarDados(String e) {

	}
	public void printDados(String e) {
		
	}
	public void organizarDados(String e) {
		
	}
}