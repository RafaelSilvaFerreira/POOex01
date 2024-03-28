package ex;

public class Circulo {

	public Double raio;
	
	public Circulo (Double raio) {
		this.raio = raio;
	};
	
	public double getPerimetro () {
		return (this.raio * 2 * 3.14);
	};

	public double getArea () {
		return (this.raio * this.raio * 3.14);
	};
}
