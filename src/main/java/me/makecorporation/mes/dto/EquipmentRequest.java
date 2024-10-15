package me.makecorporation.mes.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class EquipmentRequest {
    private String name;
    private String type;
    private String status;
}
