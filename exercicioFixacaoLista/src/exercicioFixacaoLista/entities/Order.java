package exercicioFixacaoLista.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exercicioFixacaoLista.entities.enums.OrderStatus;

public class Order {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus orderStatus;
	private Client client;
	List<OrderItem> itemList = new ArrayList<>();
	
	public Order(Date moment, OrderStatus orderStatus, Client client) {
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItemList() {
		return itemList;
	}
	
	public void addItem(OrderItem orderItem) {
		itemList.add(orderItem);
	}
	
	public void removeItem(OrderItem orderItem) {
		itemList.remove(orderItem);
	}
	
	public double total() {
		double sum = 0;
		for(OrderItem orderItem : itemList) {
			sum = sum + orderItem.subtotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
	}
}
