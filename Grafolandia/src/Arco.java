

public class Arco {
	private String cor;
	private int temp;
	
	public Arco(String cor, int temp) {
		super();
		this.cor = cor;
		this.temp = temp;
	}
	
	public int getTemp () {
		return temp;
	}
	
	public String getCor() {
		return cor;
	}
	
	@Override
	public String toString() {
		return "Vértice [cor=" + cor + ", temp=" + temp +  ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
