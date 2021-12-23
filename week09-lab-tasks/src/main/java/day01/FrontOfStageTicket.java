package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket{
    private String extraCode;

    public FrontOfStageTicket(String band, LocalDateTime startTime, int price, String extraCode) {
        super(band, startTime, price);
        this.extraCode = extraCode;
    }

    @Override
    public LocalTime entryTime() {
        return LocalTime.of(getStartTime().getHour()-2,getStartTime().getMinute());
    }
}
