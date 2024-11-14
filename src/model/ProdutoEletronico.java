package model;

public class ProdutoEletronico extends Produto {
	private String marca;
	private String voltagem;

	public ProdutoEletronico(int id, String nome, double preco, int quantidadeEstoque, String marca, String voltagem) {
		super(id, nome, preco, quantidadeEstoque);
		this.marca = marca;
		this.voltagem = voltagem;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}

	@Override
	public String toString() {
		return super.toString() + ", marca='" + marca + "', voltagem='" + voltagem + "'";
	}
}
