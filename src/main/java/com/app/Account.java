package com.app;

import java.util.UUID;

import com.jk.core.util.JKObjectUtil;

public class Account {
	String id = UUID.randomUUID().toString();
	String name;
	double balance;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return JKObjectUtil.toString(this, false);
	}

}
