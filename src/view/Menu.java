package view;

import controller.ProdutoControllerImple;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		ProdutoControllerImple controller = new ProdutoControllerImple();
		try (Scanner scanner = new Scanner(System.in)) {
			int opcao = 0;

			do {
				System.out.println("=====================================================");
				System.out.println("           🛒 ** E-COMMERCE DO DESESPERO ** 🛒");
				System.out.println("=====================================================");
				System.out.println("1. Cadastrar Produto");
				System.out.println("2. Listar Produtos");
				System.out.println("3. Procurar Produto");
				System.out.println("4. Atualizar Produto");
				System.out.println("5. ❌ Sair");
				System.out.println("=====================================================");

				System.out.print("Escolha uma opção: ");
				opcao = scanner.nextInt();

				switch (opcao) {
				case 1:
					controller.cadastrarProduto();
					break;
				case 2:
					controller.listarProdutos();
					break;
				case 3:
					controller.procurarProduto();
					break;
				case 4:
					controller.atualizarProduto();
					break;

				case 5:
					System.out.println("Saindo do programa, bye...");
					scanner.close();
					return;
				default:
					System.out.println("Opção inválida. Tente novamente.");
				}

			} while (opcao != 8);
		}
	}
}
