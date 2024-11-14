package repository;

import model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoRepositoryImpl implements ProdutoRepository {
	private List<Produto> produtos = new ArrayList<>();

	@Override
	public void cadastrar(Produto produto) {
		try {
			boolean produtoExistente = produtos.stream().anyMatch(p -> p.getId() == produto.getId());

			if (produtoExistente) {
				System.err.println("Erro: Produto com o ID " + produto.getId() + " já está cadastrado.");
				return;
			}

			produtos.add(produto);
			System.out.println("Produto cadastrado com sucesso!");
		} catch (Exception e) {
			System.err.println("Erro ao cadastrar produto: " + e.getMessage());
		}
	}

	@Override
	public List<Produto> listar() {
		if (produtos.isEmpty()) {
			System.out.println("Não há produtos cadastrados.");
		}
		return produtos;
	}

	@Override
	public Produto procurarPorId(int id) {
		for (Produto produto : produtos) {
			if (produto.getId() == id) {
				return produto;
			}
		}
		System.out.println("Produto com ID " + id + " não encontrado.");
		return null;
	}

	@Override
	public void atualizar(Produto produto) {
		Produto p = procurarPorId(produto.getId());
		if (p != null) {
			if (produto.getPreco() < 0) {
				System.out.println("Erro: Preço não pode ser negativo.");
				return;
			}

			p.setNome(produto.getNome());
			p.setPreco(produto.getPreco());

			System.out.println("Produto atualizado com sucesso!");
		} else {
			System.out.println("Produto não encontrado para atualização.");
		}
	}

	@Override
	public void remover(int id) {
		Produto produto = procurarPorId(id);
		if (produto != null) {
			produtos.remove(produto);
			System.out.println("Produto removido com sucesso!");
		} else {
			System.out.println("Erro: Produto não encontrado para remoção.");
		}
	}

}
