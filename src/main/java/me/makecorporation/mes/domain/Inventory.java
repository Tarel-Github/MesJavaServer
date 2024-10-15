package me.makecorporation.mes.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;
    private int quantity;
    private String location;

    public Inventory(String itemName, int quantity, String location) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.location = location;
    }
}
