public class Cor {

	private int yellow;
	private int green;
	private int blue;
	private int red;

	public Cor(int yellow, int green, int blue) {
		this.yellow = yellow;
		this.green = green;
		this.blue = blue;
	}

	public Cor(int cinza) {
		this.red = cinza;
	}

	public int getyellow() {
		return yellow;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}

	public int getred() {
		return red;
	}

}