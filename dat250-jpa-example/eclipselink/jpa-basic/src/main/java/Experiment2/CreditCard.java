package Experiment2;

import javax.persistence.*;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    private int number;
    private long balance;
    private long limit;
    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;

    @ManyToOne
    private PinCode pinCode;

    public Bank getBank() {
        return bank;
    }

    public PinCode getPinCode() {
        return pinCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setLimit(long limit) {
        this.limit = limit;
    }

    public void setPinCode(PinCode pinCode) {
        this.pinCode = pinCode;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
