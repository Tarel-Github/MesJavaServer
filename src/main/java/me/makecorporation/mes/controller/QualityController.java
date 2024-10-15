package me.makecorporation.mes.controller;

import me.makecorporation.mes.dto.QualityRequest;
import me.makecorporation.mes.dto.QualityResponse;
import me.makecorporation.mes.service.QualityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/quality")
public class QualityController {
    private final QualityService qualityService;

    public QualityController(QualityService qualityService) {
        this.qualityService = qualityService;
    }

    @PostMapping
    public ResponseEntity<QualityResponse> performQualityCheck(@RequestBody QualityRequest request) {
        QualityResponse response = qualityService.performQualityCheck(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<QualityResponse>> getAllQualityChecks() {
        List<QualityResponse> qualityChecks = qualityService.getAllQualityChecks();
        return ResponseEntity.ok(qualityChecks);
    }
}
