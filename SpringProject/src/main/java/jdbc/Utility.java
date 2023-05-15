package jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Utility {
	public static void main(String[] args) {
		
	
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		CustomerDao customerDao = context.getBean("cdao",CustomerDao.class);

/*
		// Simple CRUD operations method calls
//		System.out.println("creating a table");
//		customerDao.createTable();
//		System.out.println("inserting data");
//		customerDao.insertData();
//		System.out.println("updating data");
//		customerDao.updateData();
//		System.out.println("deleting data");
//		customerDao.deleteData();
*/
		
//		System.out.println("creating a table");
//		customerDao.createTable();
		
//		Adding a customer
//		System.out.println("Adding a Customer");
//		customerDao.addCustomer(1, "Dinesh", "Pune", 22);
//		customerDao.addCustomer(2, "Rohit", "Manjri", 21);
//		customerDao.addCustomer(3, "Mayur", "Hadapsar", 23);
//		customerDao.addCustomer(4, "Pratik", "Kothrud", 19);
		
//		getting a list of all customers from database
//		System.out.println("Getting a list of all customers from database");
//		List<Customer> allCustomers = customerDao.getAllCustomer();
//		for (Customer customer : allCustomers) {
//			System.out.println("id:" + customer.getId() + ", name:"+customer.getName()+", address:"+customer.getAddress()+", age:"+customer.getAge());
//		}
		
		// RowMapper getting a list of all customers from database
		System.out.println("Row Mapper : Getting a list of all customers from database");
		List<Customer> allCustomers = customerDao.showAllCustomer();
		for (Customer customer : allCustomers) {
			System.out.println("id:" + customer.getId() + ", name:"+customer.getName()+", address:"+customer.getAddress()+", age:"+customer.getAge());
		}
		
		
//		Updating a Customer 
//		System.out.println("Updating a Customer");
//		Customer customer = new Customer();
//		String name ="Mohit";
//		int id = 2;
//		customer.setName(name);
//		customer.setId(id);
//		int i = customerDao.updateCustomer(customer);
//		if (i>0) {
//			System.out.println("Updated");
//		} else {
//			System.out.println("Failed");
//		}
		
//		Deleting a Customer
//		System.out.println("Deleting a Customer");
//		int cid = 4;
//		customerDao.deleteCustomer(cid);
		
//		Extracting a count of all the cutomers
//		System.out.println("count of all the cutomers");
//		System.out.println("Total : " + customerDao.getCustomerCount());
	}
	
}
