package Stocks;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    public class GreetingController {

        private static final String template = "Hello, %s!";
        private final AtomicLong counter = new AtomicLong();

        @RequestMapping("/greeting")
        public Stocks stocks(@RequestParam(value="name", defaultValue="World") String name) {
            return new Stocks(counter.incrementAndGet(),
                    String.format(template, name));
        }
    }
}
