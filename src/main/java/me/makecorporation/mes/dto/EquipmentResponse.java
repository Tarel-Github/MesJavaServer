package me.makecorporation.mes.dto;

import lombok.Getter;
import me.makecorporation.mes.domain.Equipment;

@Getter
public class EquipmentResponse {
    private Long id;
    private String name;
    private String type;
    private String status;

    public EquipmentResponse(Equipment equipment) {
        this.id = equipment.getId();
        this.name = equipment.getName();
        this.type = equipment.getType();
        this.status = equipment.getStatus();
    }
}
