package Classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private StatusPedido Status;
	
	private Cliente cliente;
	private List<OrdemItem> items = new ArrayList <OrdemItem>();
	
	
	public Pedido() {

	}


	public Pedido(Date moment, StatusPedido status, Cliente cliente, List<OrdemItem> items) {
		this.moment = moment;
		Status = status;
		this.cliente = cliente;
	}


	public Date getMoment() {
		return moment;
	}


	public void setMoment(Date moment) {
		this.moment = moment;
	}


	public StatusPedido getStatus() {
		return Status;
	}


	public void setStatus(StatusPedido status) {
		Status = status;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

 
	public void addItem (OrdemItem item) {
		items.add(item);
	}
	
	public void removeItem (OrdemItem item) {
		items.remove(item);
	}
	
	public double Total() {
		double sum = 0.0;
		for (OrdemItem it : items) {
			sum = sum +it.TotalP();
		}
		return sum;
		
		
	}


	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do Pedido: ");
		sb.append(formatoData.format(moment) + " \n");
		sb.append("Status do Pedido: ");
		sb.append(Status + " \n" );
		sb.append("Cliente: ");
		sb.append(cliente + " \n");
		sb.append("Itens do Pedido: \n");
		for (OrdemItem item : items) {
			sb.append(item +" \n");
		}
		sb.append("Total price: $" );
		sb.append(String.format("%.2f", Total()));
	
		return 	sb.toString();
	}
	
}
