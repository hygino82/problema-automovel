package model;

public class Automovel {

	private String modelo;
	private double valor;

	public Automovel(String modelo, double valor) {
		this.modelo = modelo;
		this.valor  = valor;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return
			"Modelo ................: " + this.modelo +
			"Valor .................: R$ " + String.format("%.2f",this.valor);
	}
	
}