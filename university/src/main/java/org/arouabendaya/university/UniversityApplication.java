package org.arouabendaya.university;

import org.arouabendaya.university.entities.Product;
import org.arouabendaya.university.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UniversityApplication implements CommandLineRunner {

	@Autowired
	public ProductRepository productRepository ;

	public static void main(String[] args) {
		SpringApplication.run(UniversityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productRepository.save(new Product(null,"Computer",4300,3));
		productRepository.save(new Product(null,"Printer",1200,4));
		productRepository.save(new Product(null,"Smart Phone",3200,32));

	}
}
