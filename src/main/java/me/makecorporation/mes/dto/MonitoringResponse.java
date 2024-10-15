package me.makecorporation.mes.dto;

import lombok.Getter;
import me.makecorporation.mes.domain.Monitoring;

@Getter
public class MonitoringResponse {
    private Long id;
    private String machineId;
    private String status;
    private int outputRate;

    public MonitoringResponse(Monitoring monitoring) {
        this.id = monitoring.getId();
        this.machineId = monitoring.getMachineId();
        this.status = monitoring.getStatus();
        this.outputRate = monitoring.getOutputRate();
    }
}
