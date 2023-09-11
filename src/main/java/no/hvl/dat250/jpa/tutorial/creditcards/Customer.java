package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.Collection;
import java.util.Set;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    public String name;

    @Getter
    @Setter
    @ManyToMany
    public Set<Address> addresses;

    @Getter
    @Setter
    @ManyToMany
    public Set<CreditCard> creditCards;
}
