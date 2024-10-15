package me.makecorporation.mes.service;

import lombok.RequiredArgsConstructor;
import me.makecorporation.mes.dto.DataTrackingResponse;
import me.makecorporation.mes.repository.DataTrackingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DataTrackingService {
    private final DataTrackingRepository dataTrackingRepository;

    public List<DataTrackingResponse> getAllTrackingData() {
        return dataTrackingRepository.findAll().stream()
                .map(DataTrackingResponse::new)
                .collect(Collectors.toList());
    }
}
