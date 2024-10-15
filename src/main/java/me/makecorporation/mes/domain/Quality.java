package me.makecorporation.mes.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Quality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;
    private String inspectionResults;

    public Quality(Long productId, String inspectionResults) {
        this.productId = productId;
        this.inspectionResults = inspectionResults;
    }
}
