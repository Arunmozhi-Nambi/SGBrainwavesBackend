package Stocks;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StockRepository extends MongoRepository<Stocks, String> {

         List<Stocks>findByProductId(String product);


}
