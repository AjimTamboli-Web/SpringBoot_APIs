package com.Relation.Bidirectional.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cust_id;
	private String cust_name;
	
	@Column(unique = true)
	private String cust_acc;
	private double cust_balance;
	private short pin;
	
	@JoinColumn(name="bid")
	@ManyToOne
	private Bank bank;
	
	
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_acc() {
		return cust_acc;
	}
	public void setCust_acc(String cust_acc) {
		this.cust_acc = cust_acc;
	}
	public double getCust_balance() {
		return cust_balance;
	}
	public void setCust_balance(double cust_balance) {
		this.cust_balance = cust_balance;
	}
	public short getPin() {
		return pin;
	}
	public void setPin(short pin) {
		this.pin = pin;
	}
	
	
	
}
