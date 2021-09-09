package Experiment2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    private static final String PERSISTENCE_UNIT_NAME = "ex2";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();

        Address adr = new Address();
        adr.setStreet("Inndalsveien");
        adr.setNumb(28);
        Person per = new Person();
        per.setName("Max Mustermann");
        per.addAdr(adr);
        adr.addPerson(per);



        CreditCard c1 = new CreditCard();
        CreditCard c2 = new CreditCard();
        Bank b = new Bank();
        PinCode pin = new PinCode();
        b.setName("Pengebank");
        pin.setPin(123);
        c1.setPinCode(pin);
        c2.setPinCode(pin);
        c1.setBalance(-5000);
        c1.setLimit(-10000);
        c1.setBank(b);
        c1.setNumber(12345);
        c2.setBalance(1);
        c2.setLimit(2000);
        c2.setBank(b);
        c2.setNumber(123);
        b.addCard(c1);
        b.addCard(c2);
        per.addCard(c1);
        per.addCard(c2);

        em.persist(adr);
        em.persist(per);
        em.persist(c1);
        em.persist(c2);
        em.persist(b);
        em.persist(pin);

        em.getTransaction().commit();
        em.close();


    }
}
