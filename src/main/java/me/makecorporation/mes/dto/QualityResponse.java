package me.makecorporation.mes.dto;

import lombok.Getter;
import me.makecorporation.mes.domain.Quality;

@Getter
public class QualityResponse {
    private Long id;
    private Long productId;
    private String inspectionResults;

    public QualityResponse(Quality quality) {
        this.id = quality.getId();
        this.productId = quality.getProductId();
        this.inspectionResults = quality.getInspectionResults();
    }
}
