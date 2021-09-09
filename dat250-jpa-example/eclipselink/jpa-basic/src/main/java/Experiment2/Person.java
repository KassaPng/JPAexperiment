package Experiment2;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String name;

    @ManyToMany
    private List<Address> adr = new ArrayList<>();

    @OneToMany
    private List<CreditCard> cards = new ArrayList<>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAdr(Address adr) {
        this.adr.add(adr);
    }

    public void addCard(CreditCard c) {
        cards.add(c);
    }
}
