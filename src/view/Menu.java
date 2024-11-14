package view;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("=======================================");
			System.out.println("     🛍️  E-commerce da Renner 🛍️      ");
			System.out.println("=======================================");
			System.out.println("1️  - Adicionar produto");
			System.out.println("2️  - Listar produtos");
			System.out.println("3️  - Editar produto");
			System.out.println("4️  - Comprar produto");
			System.out.println("5️  - Sair");
			System.out.println("=======================================");
			System.out.print("🔹 Escolha uma opção: ");

			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Adicionar um novo produto ao estoque: ");
				break;
			case 2:
				System.out.println("Listando produto...");
				break;
			case 3:
				System.out.println("Editando produto...");
				break;
			case 4:
				System.out.println("Comprando produto...");
				break;
			case 5:
				System.out.println("Saindo do sistema...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");

			}

		} while (opcao != 5);

		scanner.close();

	}
}