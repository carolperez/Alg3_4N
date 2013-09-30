public class Retangulo {
	void retangulo (int x1, int y1, int x2, int y2) {
		
		retangulo (x1, y1, x2, y1);
		retangulo (x2, y1, x2, y2);
		retangulo (x2, y2, x1, y2);
		retangulo (x1, y2, x1, y1);

	}

}