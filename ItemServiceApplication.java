package com.example.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import com.example.item.domain.Item;
import com.example.item.repository.ItemRepository;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner loadData(ItemRepository itemRepository) {
//		return (args) -> {
//			itemRepository.save(new Item("1001", "Item One", "Pack One", "Size One", "Standard One", 10.50));
//			itemRepository.save(new Item("1002", "Item Two", "Pack Two", "Size Two", "Standard Two", 20.75));
//			itemRepository.save(new Item("1003", "Item Three", "Pack Three", "Size Three", "Standard Three", 30.00));
//		};
//	}
}
