package me.makecorporation.mes.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.makecorporation.mes.domain.DataTracking;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class DataTrackingResponse {
    private Long id;
    private String operationName;
    private LocalDate operationDate;
    private String operator;

}
