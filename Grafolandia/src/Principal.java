import java.util.Scanner;

	public class Principal {
		Scanner teclado = new Scanner(System.in);
		
		public static void main(String[] args) { 
			Arco a12 = new Arco("vermelho",16);
			Arco a23 = new Arco("vermelho",14);
			Arco a34 = new Arco("vermelho",12);
			Arco a45 = new Arco("vermelho",12);
			Arco a56 = new Arco("vermelho",14);
			Arco a78 = new Arco("verde",15);
			Arco a89 = new Arco("verde",11);
			Arco a910 = new Arco("verde",13);
			Arco a1011 = new Arco("verde",16);
			Arco a116 = new Arco("verde",15);
			Arco a128 = new Arco("amarelo",11);
			Arco a82 = new Arco("amarelo",8);
			Arco a215 = new Arco("amarelo",7);
			Arco a1516 = new Arco("amarelo",7);
			Arco a1617 = new Arco("amarelo",12);
			Arco a1718 = new Arco("amarelo",9);
			Arco a129 = new Arco("azul",17);
			Arco a913 = new Arco("azul",7);
			Arco a1314 = new Arco("azul",9);
			Arco a145 = new Arco("azul",9);
			Arco a517 = new Arco("azul",10);
			Arco a1013 = new Arco("roxo",11);
			Arco a133 = new Arco("roxo",13);
			Arco a316 = new Arco("roxo",11);
			Arco a1619 = new Arco("roxo",13);
			Arco a1920 = new Arco("roxo",12);
			
			Grafo g = new Grafo(21);
			g.setArco(1,2,a12);
			g.setArco(2,3,a23);
			g.setArco(3,4,a34);
			g.setArco(4,5,a45);
			g.setArco(5,6,a56);
			g.setArco(7,8,a78);
			g.setArco(8,9,a89);
			g.setArco(9,10,a910);
			g.setArco(10,11,a1011);
			g.setArco(11,6,a116);
			g.setArco(12,8,a128);
			g.setArco(8,2,a82);
			g.setArco(2,15,a215);
			g.setArco(15,16,a1516);
			g.setArco(16,17,a1617);
			g.setArco(17,18,a1718);
			g.setArco(12,9,a129);
			g.setArco(9,13,a913);
			g.setArco(13,14,a1314);
			g.setArco(14,5,a145);
			g.setArco(5,17,a517);
			g.setArco(10,13,a1013);
			g.setArco(13,3,a133);
			g.setArco(3,16,a316);
			g.setArco(16,19,a1619);
			g.setArco(19,20,a1920);
			for(int i=0;i<21;i++){
				for(int j =0;j<21;j++){
					if(g.getM(i, j) != null){
						System.out.print("Linha: " + i + " Coluna: " + j + "  ");
						System.out.println(g.getM(i, j).toString());
					}
				}
			}
			int src = 1;
			int dest = 6;
			System.out.println("Distancia entre " + src + " e " + dest + " : " + g.Dijkstra(src, dest));


		}
	}

