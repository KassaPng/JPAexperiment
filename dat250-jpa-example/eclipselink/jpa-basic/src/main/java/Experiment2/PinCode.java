package Experiment2;

import javax.persistence.*;

@Entity
public class PinCode {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    private int pin;
    private int count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
