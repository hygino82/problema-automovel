package model;

public class Ambulancia extends Automovel {

	private String tipoAmbulancia;
	private double valorTipoAmbulancia;
	private String tipoArmario;
	private double valorTipoArmario;
	private String equipamentos;
	private double valorEquipamentos;
	private double soma;
	private int prazo;

	public Ambulancia() {
		super("",0);
		this.tipoAmbulancia      = "";
		this.valorTipoAmbulancia = 0;
		this.tipoArmario         = "";
		this.valorTipoArmario    = 0;
		this.equipamentos        = "";
		this.valorEquipamentos   = 0;
		this.soma                = 0;
		this.prazo               = 0;
	}

	public Ambulancia(String modelo, double valor, String tipoAmbulancia, double valorTipoAmbulancia, String tipoArmario, double valorTipoArmario, String equipamentos, double valorEquipamentos, int prazo) {
		super(modelo, valor);
		this.tipoAmbulancia      = tipoAmbulancia;
		this.valorTipoAmbulancia = valorTipoAmbulancia;
		this.tipoArmario         = tipoArmario;
		this.valorTipoArmario    = valorTipoArmario;
		this.equipamentos        = equipamentos;
		this.valorEquipamentos   = valorEquipamentos;
		this.prazo               = prazo;
	}

	public String getTipoAmbulancia() {
		return this.tipoAmbulancia;
	}

	public void setTipoAmbulancia(String tipoAmbulancia) {
		this.tipoAmbulancia = tipoAmbulancia;
	}

	public double getValorTipoAmbulancia() {
		return this.valorTipoAmbulancia;
	}

	public void setValorTipoAmbulancia(double valorTipoAmbulancia) {
		this.valorTipoAmbulancia = valorTipoAmbulancia;
	}

	public String getTipoArmario() {
		return this.tipoArmario;
	}

	public void setTipoArmario(String tipoArmario) {
		this.tipoArmario = tipoArmario;
	}

	public double getValorTipoArmario() {
		return this.valorTipoArmario;
	}

	public void setValorTipoArmario(double valorTipoArmario) {
		this.valorTipoArmario = valorTipoArmario;
	}

	public String getEquipamentos() {
		return this.equipamentos;
	}

	public void setEquipamentos(String equipamentos) {
		this.equipamentos = equipamentos;
	}

	public double getValorEquipamentos() {
		return this.valorEquipamentos;
	}

	public void setValorEquipamentos(double valorEquipamentos) {
		this.valorEquipamentos = valorEquipamentos;
	}

	public double getSoma() {
		double soma;
		soma = super.getValor() + this.valorTipoAmbulancia + this.valorTipoArmario + this.valorEquipamentos;
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}

	public int getPrazo() {
		return this.prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	@Override
	public String toString() {
		return
			super.toString()                                       +
			"Tipo Ambulancia .......: " + this.tipoAmbulancia      +
			"Valor Tipo Ambulancia .: " + this.valorTipoAmbulancia +
			"Tipo Armario ..........: " + this.tipoArmario         +
			"Valor Tipo Armario ....: " + this.valorTipoArmario    +
			"Equipamentos ..........: " + this.equipamentos        +
			"Valor Equipamentos ....: " + this.valorEquipamentos   +
			"Soma ..................: " + this.soma                +
			"Prazo .................: " + this.prazo ;
	}

}