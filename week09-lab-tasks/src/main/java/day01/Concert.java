package day01;


import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {
    private List<Person> people = new ArrayList<>();

    public void addPerson(Person person, LocalTime entryTime){
        if(entryTime.isAfter(person.getTicket().entryTime())){
            this.people.add(person);
        }
        else{
            throw new IllegalArgumentException("Cannot go in this time!");
        }

    }
}
