package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import enums.StatusPedido;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Digite o nome do cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.next();
		System.out.print("Data de nascimento (DD/MM/YYYY): ");
		Date dataNasc = sdf.parse(sc.next());

		Cliente cliente = new Cliente(nome, email, dataNasc);

		System.out.println("Digite data do pedido:");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());

		Pedido pedido = new Pedido(new Date(), status, cliente);

		System.out.print("Quantos itens para esse pedido? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Digite #" + i + " item data:");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preço do produto: ");
			double precoProduto = sc.nextDouble();

			Produto produto = new Produto(nomeProduto, precoProduto);

			System.out.print("Quantidade: ");
			int quant = sc.nextInt();

			ItemPedido itemPedido = new ItemPedido(quant, precoProduto, produto);

			pedido.addItem(itemPedido);
		}

		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(pedido);

		sc.close();
	}

}
