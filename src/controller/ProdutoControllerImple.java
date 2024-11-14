package controller;

import model.Produto;
import repository.ProdutoRepository;
import repository.ProdutoRepositoryImpl;
import java.util.List;
import java.util.Scanner;

public class ProdutoControllerImple {
	private ProdutoRepository produtoRepository = new ProdutoRepositoryImpl();
	private Scanner scanner = new Scanner(System.in);

	public void cadastrarProduto() {
		System.out.print("Digite o ID do produto: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Digite o nome do produto: ");
		String nome = scanner.nextLine();
		System.out.print("Digite o preço do produto: ");
		float preco = scanner.nextFloat();

		Produto produto = new Produto(id, nome, preco);
		produtoRepository.cadastrar(produto);
	}

	public void listarProdutos() {
		List<Produto> produtos = produtoRepository.listar();
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}

	public void procurarProduto() {
		System.out.print("Digite o ID do produto a ser buscado: ");
		int id = scanner.nextInt();
		Produto produto = produtoRepository.procurarPorId(id);
		if (produto != null) {
			System.out.println(produto);
		} else {
			System.out.println("Produto não encontrado.");
		}
	}

	public void atualizarProduto() {
		System.out.print("Digite o ID do produto a ser atualizado: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Digite o novo nome do produto: ");
		String nome = scanner.nextLine();
		System.out.print("Digite o novo preço do produto: ");
		float preco = scanner.nextFloat();

		Produto produto = new Produto(id, nome, preco);
		produtoRepository.atualizar(produto);
	}

}
