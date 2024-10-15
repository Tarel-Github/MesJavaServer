package me.makecorporation.mes.controller;

import me.makecorporation.mes.dto.DataTrackingResponse;
import me.makecorporation.mes.service.DataTrackingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/data-tracking")
public class DataTrackingController {
    private final DataTrackingService dataTrackingService;

    public DataTrackingController(DataTrackingService dataTrackingService) {
        this.dataTrackingService = dataTrackingService;
    }

    @GetMapping
    public ResponseEntity<List<DataTrackingResponse>> getAllTrackingData() {
        List<DataTrackingResponse> trackingData = dataTrackingService.getAllTrackingData();
        return ResponseEntity.ok(trackingData);
    }
}
