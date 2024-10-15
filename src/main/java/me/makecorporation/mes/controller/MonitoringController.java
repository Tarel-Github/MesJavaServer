package me.makecorporation.mes.controller;


import me.makecorporation.mes.dto.MonitoringResponse;
import me.makecorporation.mes.service.MonitoringService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/monitoring")
public class MonitoringController {
    private final MonitoringService monitoringService;

    public MonitoringController(MonitoringService monitoringService) {
        this.monitoringService = monitoringService;
    }

    @GetMapping
    public ResponseEntity<List<MonitoringResponse>> getRealTimeData() {
        List<MonitoringResponse> monitoringData = monitoringService.getRealTimeMonitoringData();
        return ResponseEntity.ok(monitoringData);
    }
}
