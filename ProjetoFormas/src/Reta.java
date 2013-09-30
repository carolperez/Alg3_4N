public class Reta {

	private Ponto p0, p1;
	private Ponto ponto  = new Ponto();

	public void setVertices(Ponto p0, Ponto p1){
		this.p0 = p0;
		this.p1 = p1;		
	}

	public void desenhaReta(Cor c, Imagem img) {
		img.SetPixel(p0, c);
		img.SetPixel(p1, c);

		int x, y, erro, dX, dY;
		erro = 0;
		x = p0.x;
		y = p0.y;
		dX = p1.x - p0.x;
		dY = p1.y - p0.y;
 
		if ((Math.abs(dY)>=Math.abs(dX) && p0.y > p1.y) || (Math.abs(dY)<Math.abs(dX) && dY<0)) {
			x = p1.x;
			y = p1.y;
			dX = p0.x - p1.x;
			dY = p0.y - p1.y;
		}
		if (dX>=0) {
			if (Math.abs(dX) >= Math.abs(dY)){

				for (int i = 1; i < Math.abs(dX); i++){
					if (erro < 0){
						x++;
						ponto.x = x;
						ponto.y = y;
						img.SetPixel(ponto, c);						
						erro += dY;
					} else {
						x++;
						y++;
						ponto.x = x;
						ponto.y = y;
						img.SetPixel(ponto, c);
						erro += dY - dX;
					}
				}
			} else {

				for (int i = 1; i < Math.abs(dY); i++){
					if (erro < 0){
						x++;
						y++;
						ponto.x = x;
						ponto.y = y;
						img.SetPixel(ponto, c);
						erro += dY - dX;						
					}else{
						y++;
						ponto.x = x;
						ponto.y = y;
						img.SetPixel(ponto, c);
						erro -= dX;
					}
				}
			}
		} else { 
			if (Math.abs(dX) >= Math.abs(dY)){

				for(int i = 1; i < Math.abs(dX); i++){
					if(erro<0){
						x--;
						ponto.x = x;
						ponto.y = y;
						img.SetPixel(ponto, c);
						erro += dY;
					}else{
						x--;
						y++;
						ponto.x = x;
						ponto.y = y;
						img.SetPixel(ponto, c);
						erro += dY + dX;
					}
				}
			} else {

				for(int i=1; i < Math.abs(dY); i++){
					if (erro < 0){
						x--;
						y++;
						ponto.x = x;
						ponto.y = y;
						img.SetPixel(ponto, c);
						erro += dY + dX;						
					} else {
						y++;						
						ponto.x = x;
						ponto.y = y;
						img.SetPixel(ponto, c);
						erro += dX;
					}
				}
			}
		}
	}

}