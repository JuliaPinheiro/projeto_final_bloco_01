package repository;

import model.Produto;
import java.util.List;

public interface ProdutoRepository {
	void cadastrar(Produto produto);

	List<Produto> listar();

	Produto procurarPorId(int id);

	void atualizar(Produto produto);

	void remover(int id);

}
