package me.makecorporation.mes.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Getter
@NoArgsConstructor
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jobName;

    private LocalDate startDate;

    private LocalDate endDate;

    public Schedule(String jobName, LocalDate startDate, LocalDate endDate) {
        this.jobName = jobName;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
