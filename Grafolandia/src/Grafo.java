import java.util.ArrayList;
import java.util.Vector;

public class Grafo {

	private Arco m[][];
	private int tam;
	private Vector<Integer> listatemp;
	
	public Grafo(int tam) {
		super();
		m = new Arco[tam][tam];
		this.tam = tam;
		listatemp = new Vector<Integer>(tam);
	}

	public void setArco(int i, int j, Arco a) {
		this.m[i][j] = a;
		this.m[j][i] = a;
	}

	public Arco getM(int i,int j) {
		return m[i][j];
	}
	
	public int getTam() {
		return tam;
	}
	
	public int Dijkstra (int src, int dest) {
		ArrayList<Integer> listaflag = new ArrayList<Integer>();
		int aux = src, linha=0, coluna=0;
		int i;
		
		for (i = 0;i < tam; i++) 
			listatemp.add(i, Integer.MAX_VALUE);
		listatemp.set(src,0);
		System.out.println(listatemp.toString());
		
		while(listatemp.get(dest) == Integer.MAX_VALUE) {
			for (i = 1; i < tam; i++) {
				if (m[aux][i] != null)
					if((listatemp.get(aux) + m[aux][i].getTemp()) < listatemp.get(i))
						listatemp.set(i, listatemp.get(aux) + m[aux][i].getTemp());
						if(aux != src){
							if(m[linha][coluna].getCor() != m[aux][i].getCor()){
								listatemp.set(i, listatemp.get(aux) + 6);
							}
						}
						
						linha = aux;
						coluna = i;
			}
			System.out.println(listatemp.toString());
			
			listaflag.add(aux);
			
			int temp = aux;
			for (i = 1; temp == aux; i++) {
				if (listatemp.get(i) < Integer.MAX_VALUE)
					if (listaflag.contains(i) == false)
						aux = i;
			}
			
			for (; i < tam; i++) {
				if (listatemp.get(i) < listatemp.get(aux))
					if (listaflag.contains(i) == false)
						aux = i;
			}
		}
		
		return listatemp.get(dest);
	}
}
