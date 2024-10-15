package me.makecorporation.mes.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@NoArgsConstructor
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;
    private String status;

    public Equipment(String name, String type, String status) {
        this.name = name;
        this.type = type;
        this.status = status;
    }
}
