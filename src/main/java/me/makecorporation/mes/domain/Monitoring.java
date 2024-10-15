package me.makecorporation.mes.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Monitoring {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String machineId;
    private String status;
    private int outputRate; // 생산 속도, 단위 시간당 출력량

    public Monitoring(String machineId, String status, int outputRate) {
        this.machineId = machineId;
        this.status = status;
        this.outputRate = outputRate;
    }
}
