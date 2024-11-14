package repository;

import model.Produto;
import java.util.List;

public interface ProdutoRepository {
	Produto procurarPorId(int id);

	List<Produto> listarTodos();

	void cadastrar(Produto produto);

	void atualizar(Produto produto);

	void deletar(int id);

	void adicionarEstoque(int id, int quantidade);

	void removerEstoque(int id, int quantidade);

	boolean comprarProduto(int id, int quantidade);
}