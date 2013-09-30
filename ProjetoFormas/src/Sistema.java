import java.util.Scanner;

public class Sistema {

	private static Scanner sc = new Scanner(System.in);
	static Triangulo triangulo = new Triangulo();
	static Circulo circulo = new Circulo();
	static Retangulo retangulo = new Retangulo();
	static Reta reta = new Reta();
    
	int i = sc.nextInt();
	public static String cmd = "";


	public static void Triangulo(){
				
	}

	public static void Circulo(){
		int x = sc.nextInt();
		int y = sc.nextInt();
		int raio = sc.nextInt();
		Imagem img = new Imagem();
		Cor cor = new Cor(0);

		Circulo circulo = new Circulo( );
		circulo.setCentro(x, y);
		circulo.setRaio(raio);
		circulo.desenhaCirculo(cor, img);	
	}

	public static void Retangulo(){
		Ponto p0 = new Ponto();
		Ponto p1 = new Ponto();

	}

	public static void Reta(){
		Ponto p0 = new Ponto();
		Ponto p1 = new Ponto();

		Imagem img = new Imagem();
		Cor cor = new Cor(0);

		p0.x = sc.nextInt();
		p0.y = sc.nextInt();
		p1.x = sc.nextInt();
		p1.y = sc.nextInt();

		reta.desenhaReta(cor, img);
	}
}