package me.makecorporation.mes.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class QualityRequest {
    private Long productId;
    private String inspectionResults;
}
