package model;

public class ProdutoEletronico extends Produto {
	private String marca;
	private String modelo;

	public ProdutoEletronico(int id, String nome, float preco, String marca, String modelo) {
		super(id, nome, preco);
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return super.toString() + ", marca=" + marca + ", modelo=" + modelo;
	}
}
