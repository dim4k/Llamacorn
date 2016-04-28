package llamacorn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication  
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repository, AnimalRepository animalrep) {
		return (args) -> {
			// save a couple of customers
			Customer c1 = new Customer("Padow", "Tchekov");
			repository.save(c1);
			Animal chien = new Animal("Rex", c1);
			animalrep.save(chien);
			
			repository.save(new Customer("Jack", "Bauer"));
			//repository.save(new Customer("Jack", "Bauer",chien));
			
			// fetch an individual customer by ID
			Customer customer = repository.findOne(1L);
			//customer.getAnimals().toString();
			log.info("Customer found with findOne(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
            log.info("");
            
            Animal chien1 = animalrep.findOne(1L);
            
//			//customer.getAnimals().toString();
//			log.info("Customer found with findOne(1L):");
			log.info("--------------------------------");
			log.info(chien1.toString());
			log.info(chien1.getOwner().getFirstname());
			log.info("--------------------------------");
//            log.info("");
            
            

			// fetch customers by last name
			log.info("Customer found with findByLastName('Tchekov'):");
			log.info("--------------------------------------------");
			for (Customer bauer : repository.findByName("Tchekov")) {
				log.info(bauer.toString());
			}
            log.info("");
		};
	}
}
