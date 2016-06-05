package com.percepton.entity;

import java.util.Date;

public class Order
{
	private Integer orderId;
	private Date orderDate;
	private Date deliveryDate;
	private Float totalPrice;
	private Integer totalQty;
	private String paymentGetwayName;
	private String paymentStatus;
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Integer getTotalQty() {
		return totalQty;
	}
	public void setTotalQty(Integer totalQty) {
		this.totalQty = totalQty;
	}
	public String getPaymentGetwayName() {
		return paymentGetwayName;
	}
	public void setPaymentGetwayName(String paymentGetwayName) {
		this.paymentGetwayName = paymentGetwayName;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	
}
