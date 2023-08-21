package App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Classes.Cliente;
import Classes.OrdemItem;
import Classes.Pedido;
import Classes.Produto;
import Classes.StatusPedido;

public class programa {

	public static void main(String[] args) throws ParseException {
	
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in); 
		
		System.out.println("Informe os dados do Cliente");
		System.out.println("Nome: ");
		String name = leia.nextLine();
		System.out.println("email: ");
		String email = leia.nextLine();
		System.out.println("Data de Aniversario EX: (dd/mm/yyyy): ");
		Date datadeAniversario = formatoData.parse(leia.next());
				
		Cliente C2 = new Cliente (name,email,datadeAniversario);
		
		System.out.println("Entre com os dados do Pedido");
		System.out.println("Status: ");
		StatusPedido status = StatusPedido.valueOf(leia.next());
		
		
		Pedido pedidoNovo = new Pedido(datadeAniversario, status,C2,null);
		
		System.out.println("Quantos itens possue o Pedido?");
		int N = leia.nextInt();
		for( int i = 1; i <=N; i++) {
			System.out.println("Item # "+i+ " informacoes do item:");
			System.out.println("Nome do Produto: ");
			leia.nextLine();
			String ProdutoName = leia.nextLine();
			System.out.println("Preco do Produto: ");
			double PrecoProduto = leia.nextDouble();
			System.out.println("Quantidade: ");
			int quantidade = leia.nextInt();
			
			Produto p3 = new Produto(ProdutoName,PrecoProduto);
			
			
			  OrdemItem it = new OrdemItem(quantidade,PrecoProduto, p3);
			 
			pedidoNovo.addItem(it);
		}
		
		System.out.println(); 
		System.out.println(pedidoNovo);
		
		/* * *		Produto p1 = new Produto ("Tv",1000);
		OrdemItem ordem1 = new OrdemItem(1,1000,p1);
		
		System.out.println(ordem1.getProduct().getName());
		System.out.println(ordem1);
		
		Cliente c1 = new Cliente("Maria", "blalblabla@gmail.com", formatoData.parse("20/10/1995"));
		
		System.out.println(c1);*/

		
		leia.close();
	}

}
