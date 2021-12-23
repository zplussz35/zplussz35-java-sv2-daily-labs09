package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

    @Test
    void addPerson() {
        Concert concert = new Concert();

        assertThrows(IllegalArgumentException.class,
                ()->concert.addPerson(new Person(new Ticket("Queen", LocalDateTime.now(),2000)), LocalTime.of(1,0)));
    }
}