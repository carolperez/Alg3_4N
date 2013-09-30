import java.util.Scanner;

public class Imagem {
	
	private int[][] img;
	private String cor = "";
	
	public void SetPixel(Ponto p, Cor cor){

		if (this.cor.equalsIgnoreCase("g")){
			img[p.x][p.y] = cor.getBlue();
		}		
	}

	public static void main(String[] args) {
		
		Ponto ponto = new Ponto();		
		Scanner ler = new Scanner(System.in);
				
		String comando = "";
		
		while(true){
			
			
			System.out.println("Digite a forma geométrica que você deseja contruir:");
			String forma = ler.nextLine();
			System.out.println("Digite X:");
			ponto.x = ler.nextInt();
			System.out.println("Digite Y:");
			ponto.y = ler.nextInt();
			System.out.println("Continuar?");
			comando = ler.next();
			if(comando.equalsIgnoreCase("Nãoo"))
				break;			
			
			System.out.println("["+ponto.x+","+ponto.y+"]");
		}
	}
}