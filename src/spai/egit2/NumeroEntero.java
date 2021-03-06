package spai.egit2;

public class NumeroEntero {
	private int valor;

	public NumeroEntero(int valor) {
		this.valor = valor;
	}

	public NumeroEntero() {
		this(0);
	}

	public int getValor() {
		return valor;
	}

	private void setValor(int valor) {
		this.valor = valor;
	}

	public void incrementar(int incremento) {
		this.setValor(this.valor + incremento);
	}

	public void doblar() {
		this.setValor(this.valor * 2);
	}

	public void decrementar(int decremento) {
		this.setValor(this.valor - decremento);
	}

	public int sumar(int valor1, int valor2) {
		return valor1 + valor2;
	}

	public int multiplicar(int valor1, int valor2) {
		return valor1 * valor2;
	}
}
