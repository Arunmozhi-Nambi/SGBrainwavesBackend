package Stocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


///Users/arunmozhinambi/Downloads/mongodb-osx-x86_64-4.0.5/bin
    @SpringBootApplication
    public class Application implements CommandLineRunner {

        @Autowired
        private StockRepository repository;

        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }

        @Override
        public void run(String... args) throws Exception {

            repository.deleteAll();

            // save a couple of customers
            repository.save(new Stocks());
            repository.save(new Stocks());

            // fetch all customers
            System.out.println("Stocks found with findAll():");
            System.out.println("-------------------------------");
            for (Stocks stock : repository.findAll()) {
                System.out.println(stock);
            }
            System.out.println();

            // fetch an individual customer
            System.out.println("Stocks with product WLTW");
            System.out.println("--------------------------------");
            System.out.println(repository.findByProductId("WLTW"));
            }
    }