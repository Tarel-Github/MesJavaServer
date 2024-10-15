package me.makecorporation.mes.dto;

import lombok.Getter;
import me.makecorporation.mes.domain.Schedule;

import java.time.LocalDate;

@Getter
public class ScheduleResponse {
    private Long id;
    private String jobName;
    private LocalDate startDate;
    private LocalDate endDate;

    public ScheduleResponse(Schedule schedule) {
        this.id = schedule.getId();
        this.jobName = schedule.getJobName();
        this.startDate = schedule.getStartDate();
        this.endDate = schedule.getEndDate();
    }
}
