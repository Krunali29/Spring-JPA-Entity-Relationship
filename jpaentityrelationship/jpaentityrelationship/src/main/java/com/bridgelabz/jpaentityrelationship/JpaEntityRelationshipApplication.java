package com.bridgelabz.jpaentityrelationship;

import com.bridgelabz.jpaentityrelationship.entity.Customer;
import com.bridgelabz.jpaentityrelationship.entity.Item;
import com.bridgelabz.jpaentityrelationship.repository.CustomerRepository;
import com.bridgelabz.jpaentityrelationship.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaEntityRelationshipApplication implements CommandLineRunner {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaEntityRelationshipApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		Customer customer=new Customer("Tom");

		Item item1=new Item("Item1");
		Item item2=new Item("Item2");
		Item item3=new Item("Item3");
		Item item4=new Item("Item4");
		Item item5=new Item("Item5");
		Item item6=new Item("Item6");

		customer.getItems().add(item1);
		customer.getItems().add(item2);
		customer.getItems().add(item3);
		customer.getItems().add(item4);
		customer.getItems().add(item5);
		customer.getItems().add(item6);

		/*item1.setCustomer(customer);
		item2.setCustomer(customer);*/

		customerRepository.save(customer);


	}
}
