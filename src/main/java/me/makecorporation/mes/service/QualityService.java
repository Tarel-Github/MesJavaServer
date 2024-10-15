package me.makecorporation.mes.service;

import lombok.RequiredArgsConstructor;
import me.makecorporation.mes.domain.Quality;
import me.makecorporation.mes.dto.QualityRequest;
import me.makecorporation.mes.dto.QualityResponse;
import me.makecorporation.mes.repository.QualityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QualityService {
    private final QualityRepository qualityRepository;

    public QualityResponse performQualityCheck(QualityRequest request) {
        Quality qualityCheck = new Quality(request.getProductId(), request.getInspectionResults());
        qualityRepository.save(qualityCheck);
        return new QualityResponse(qualityCheck);
    }

    public List<QualityResponse> getAllQualityChecks() {
        return qualityRepository.findAll().stream()
                .map(QualityResponse::new)
                .collect(Collectors.toList());
    }
}
