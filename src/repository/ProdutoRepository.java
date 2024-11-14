package repository;

import model.Produto;
import java.util.List;

public interface ProdutoRepository {
	void cadastrar(Produto produto);

	List<Produto> listarTodos();

	Produto procurarPorId(int id);

	void atualizar(Produto produto);

	boolean comprarProduto(int id, int quantidade);

	void adicionarEstoque(int id, int quantidade);

	void removerEstoque(int id, int quantidade);
}