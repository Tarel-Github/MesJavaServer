package me.makecorporation.mes.service;

import lombok.RequiredArgsConstructor;
import me.makecorporation.mes.dto.MonitoringResponse;
import me.makecorporation.mes.repository.MonitoringRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MonitoringService {
    private final MonitoringRepository monitoringRepository;

    public List<MonitoringResponse> getRealTimeMonitoringData() {
        return monitoringRepository.findAll().stream()
                .map(MonitoringResponse::new)
                .collect(Collectors.toList());
    }
}
