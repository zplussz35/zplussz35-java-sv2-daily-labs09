package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {
    private String band;
    private LocalDateTime startTime;
    private int price;

    public Ticket(String band, LocalDateTime startTime, int price) {
        this.band = band;
        this.startTime = startTime;
        this.price = price;
    }

    public String getBand() {
        return band;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public int getPrice() {
        return price;
    }
    public LocalTime entryTime(){
        return LocalTime.of(startTime.getHour()-1,startTime.getMinute());
    }
}
