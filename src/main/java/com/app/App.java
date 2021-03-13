package com.app;

import java.util.List;

import com.jk.db.dataaccess.nosql.JKNoSqlDataAccess;
import com.jk.db.dataaccess.orm.JKObjectDataAccess;
import com.jk.db.datasource.JKDataAccessFactory;
import com.jk.util.JK;

public class App {
	private static String id;

	public static void main(String[] args) {
		JKNoSqlDataAccess dataAccess = JKDataAccessFactory.getNoSqlDataAccess();

		insert(dataAccess);
		getAll(dataAccess);
		find(dataAccess);
		update(dataAccess);
		delete(dataAccess);
	}

	private static void insert(JKNoSqlDataAccess dataAccess) {
		Account account = new Account();
		account.setName("Jalal");
		account.setBalance(100);

		// insert the object in the database using JPA/Hibernate implementation
		dataAccess.insert(account);
		id = account.getId();
	}

	private static void getAll(JKNoSqlDataAccess dataAccess) {
		// Retrieve list of objects from database using JPA
		List<Account> list = dataAccess.getList(Account.class);
		for (Account account : list) {
			JK.print(account);
		}
	}

	private static Account find(JKNoSqlDataAccess dataAccess) {
		// Find an object from database using JPA
		Account std = dataAccess.find(Account.class, id);
		return std;
	}

	private static void update(JKNoSqlDataAccess dataAccess) {
		Account std = find(dataAccess);
		std.setName("Updated Jalal");

		// update record in the databse
		dataAccess.update(std);
	}

	private static void delete(JKNoSqlDataAccess dataAccess) {
		dataAccess.delete(Account.class, id);
	}

}
