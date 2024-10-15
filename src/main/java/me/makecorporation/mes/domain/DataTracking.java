package me.makecorporation.mes.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
public class DataTracking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String operationName;
    private LocalDate operationDate;
    private String operator;

    public DataTracking(String operationName, LocalDate operationDate, String operator) {
        this.operationName = operationName;
        this.operationDate = operationDate;
        this.operator = operator;
    }
}
