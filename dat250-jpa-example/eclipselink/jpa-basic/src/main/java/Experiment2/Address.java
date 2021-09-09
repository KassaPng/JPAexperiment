package Experiment2;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    private String street;
    private int numb;

    @ManyToMany
    private List<Person> people = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void addPerson(Person p) {
        people.add(p);
    }
}
