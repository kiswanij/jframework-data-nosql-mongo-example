package com.app;

import java.util.List;

import com.jk.db.dataaccess.nosql.JKNoSqlDataAccess;
import com.jk.db.dataaccess.orm.JKObjectDataAccess;
import com.jk.db.datasource.JKDataAccessFactory;

public class App {
	public static void main(String[] args) {
		JKNoSqlDataAccess dataAccess= JKDataAccessFactory.getNoSqlDataAccess();
		//Create Object dao

		//Create JPA object
		Account account = new Account();
		account.setName("Jalal");
		account.setBalance(100);
		
		//insert the object in the database using JPA/Hibernate implementation
		dataAccess.insert(account);
		String id=account.getId();
		
		//Retrieve list of objects from database using JPA 
		List<Account> list = dataAccess.getList(Account.class);
		for (Account std : list) {
			System.out.println(std);
		}
		
		//Find an object from database using JPA
		Account std = dataAccess.find(Account.class, id);
		std.setName("Updated Jalal");
		
		//update record in the databse
		dataAccess.update(std);
		
		//Delete object from database using an ID
		dataAccess.delete(Account.class, id);		
		
	}
}
