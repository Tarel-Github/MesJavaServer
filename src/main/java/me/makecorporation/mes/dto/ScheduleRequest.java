package me.makecorporation.mes.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class ScheduleRequest {
    private String jobName;
    private LocalDate startDate;
    private LocalDate endDate;
}
