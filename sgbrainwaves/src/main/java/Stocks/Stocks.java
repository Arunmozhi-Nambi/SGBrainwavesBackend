package Stocks;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Stocks  {

        @Id
        public String id;
        public Date date;
        public Double open;
        public Double close;
        public Double low;
        public Double high;
        public Double volume;

        public Stocks() {}

        public Stocks(Date date, Double open, Double close, Double low, Double high, Double volume) {
            this.date = date;
            this.open = open;
            this.close = close;
            this.low = low;
            this.high = high;
            this.volume = volume;
        }

    public Stocks(long incrementAndGet, String format) {
        return;
    }

    @Override
        public String toString() {
            return String.format(
                    "Stocks[id=%s, date='%d', lastName='%d']",
                    id, open, close);
        }

}