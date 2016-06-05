package com.percepton.entity;

public class OrderItem
{
	private Integer OrderItemId;
	private Integer qty;
	private Float price;
	public Integer getOrderItemId() {
		return OrderItemId;
	}
	public void setOrderItemId(Integer orderItemId) {
		OrderItemId = orderItemId;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
	
}
